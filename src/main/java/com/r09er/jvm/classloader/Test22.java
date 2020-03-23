package com.r09er.jvm.classloader;

/**
 * @author roger
 * @date 2020/3/17
 */
public class Test22 {

    static {
        System.out.println("Test22 static block");
    }

    public static void main(String[] args) {
        //默认情况下,会输出同一个类加载器AppClassLoader
        //1.将class字节码打包成jar包
        //2 修改ext加载路径
        //3.java -Djava.ext.dirs=./ com.r09er.jvm.classloader.Test22
        //输出信息:
        //Test22 static block
        //sun.misc.Launcher$AppClassLoader@2a139a55
        //sun.misc.Launcher$ExtClassLoader@3d4eac69
        System.out.println(Test22.class.getClassLoader());
        System.out.println(Test01.class.getClassLoader());
        String[] arr = new String[2];
        System.out.println(arr.getClass().getClassLoader());
        Test01[] test01s = new Test01[2];
        System.out.println(test01s.getClass().getClassLoader());
    }
}
