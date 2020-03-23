package com.r09er.jvm.classloader;

/**
 * 将字节码文件放到根类加载器上,运行main方法
 *
 * @author roger
 * @date 2020/3/17
 */
public class Test18_1 {

    public static void main(String[] args) throws ClassNotFoundException {
        Test16 loader1 = new Test16("loader1");
        loader1.setPath("/Users/cicinnus/Documents/sources/jvm-learning/");
        Class<?> aClass = loader1.loadClass("com.r09er.jvm.classloader.Test01");

        System.out.println(loader1.hashCode());
        //将编译后的class字节码文件放到`System.getProperty("sun.boot.class.path")`其中一个目录下
        //可以看到classLoader变为了null
        System.out.println("class loader : " + aClass.getClassLoader());

    }
}
