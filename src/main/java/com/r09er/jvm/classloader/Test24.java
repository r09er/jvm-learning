package com.r09er.jvm.classloader;

/**
 * @author roger
 * @date 2020/3/18
 */
public class Test24 {

    public static void main(String[] args) {
        //appClassLoader
        System.out.println(Thread.currentThread().getContextClassLoader());
        //BootstrapClassLoader
        System.out.println(Thread.class.getClassLoader());
    }
}
