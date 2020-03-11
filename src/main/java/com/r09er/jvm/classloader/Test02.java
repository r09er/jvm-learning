package com.r09er.jvm.classloader;

/**
 * 类的被动使用
 * -XX:+TraceClassLoading,用于追踪类的加载信息并打印,配置在JVM启动参数中
 *
 * @author roger
 * @date 2020/3/11
 */
public class Test02 {

    public static void main(String[] args) {
        //情况1.调用子类的str,
        //输出    parent static block
        //       hello jvm
        System.out.println(Child.str);
        //情况2.调用子类的str2
        //输出   parent static block
        //      child static block
        //      hello jvm2
        //
//        System.out.println(Child.str2);
        //情况3.加入jvm参数后调用str,观察Child是否有被加载
//        System.out.println(Child.str);
    }
}

class Parent {

    public static String str = "hello jvm";

    static {
        System.out.println("parent static block");
    }

}

class Child extends Parent {

    public static String str2 = "hello jvm2";

    static {
        System.out.println("child static block");
    }
}
