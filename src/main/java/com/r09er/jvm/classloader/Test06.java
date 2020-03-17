package com.r09er.jvm.classloader;

/**
 * 当一个接口初始化时,并不要求其父接口完成了初始化
 * 在本例中,即使删掉两个接口的字节码文件,运行依然正常,通过-XX:+TraceClassLoading会发现两个接口并没有被加载
 * 是否能够加载很重要的一个判断依据就是在编译期,变量能否被确定下来
 *
 * @author roger
 * @date 2020/3/11
 */
public class Test06 {

    public static void main(String[] args) {
        System.out.println(ThreadChild.childThread);
    }
}

interface Parent6 {
    /**
     * 接口定义的变量和方法一定public static的
     */
    public static final int a = 5;
}

interface Child6 extends Parent6 {
    public static int b = 6;
}

interface ThreadParent {
    public static Thread thread = new Thread() {
        {
            System.out.println("Thread Parent init");
        }
    };
}

interface ThreadChild extends ThreadParent {
    public static final Thread childThread = new Thread(){
        {
            System.out.println("child thread initialized");
        }
    };
}