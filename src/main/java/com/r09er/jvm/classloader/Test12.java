package com.r09er.jvm.classloader;

/**
 * @author roger
 * @date 2020/3/13
 */
public class Test12 {

    public static void main(String[] args) throws Exception {
        ClassLoader loader  = ClassLoader.getSystemClassLoader();
        Class<?> aClass = loader.loadClass("com.r09er.jvm.classloader.TestClassLoader");

        System.out.println(aClass);

        System.out.println("-------");

        aClass = Class.forName("com.r09er.jvm.classloader.TestClassLoader");

        System.out.println(aClass);

    }
}
class TestClassLoader{
    static {
        System.out.println("Test classloader");
    }
}