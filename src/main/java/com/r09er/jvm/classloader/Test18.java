package com.r09er.jvm.classloader;

/**
 * 类加载器加载类的路径
 *
 * @author roger
 * @date 2020/3/17
 */
public class Test18 {

    public static void main(String[] args) {
        //bootstrapClassLoader加载的路径
        System.out.println(System.getProperty("sun.boot.class.path"));
        //extClassLoader
        System.out.println(System.getProperty("java.ext.dirs"));
        //自定义类路径
        System.out.println(System.getProperty("java.class.path"));
    }
}
