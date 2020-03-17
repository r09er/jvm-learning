package com.r09er.jvm.classloader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author roger
 * @date 2020/3/14
 */
public class Test16 extends ClassLoader {

    private String classLoaderName;

    private String path;

    private final String fileExtension = ".class";


    public Test16(String classLoaderName) {
        //将systemClassLoader作为当前加载器的父加载器
        super();
        this.classLoaderName = classLoaderName;
    }

    public Test16(ClassLoader parent, String classLoaderName) {
        //将自定义的ClassLoader作为当前加载器的父加载器
        super(parent);
        this.classLoaderName = classLoaderName;
    }


    public void setPath(String path) {
        this.path = path;
    }

    public static void main(String[] args) throws Exception {
        Test16 loader1 = new Test16("loader1");
        //设置绝对路径,加载工程根目录下的com.r09er.jvm.classloader.Test01.class
        loader1.setPath("/Users/cicinnus/Documents/sources/jvm-learning/");
        Class<?> aClass = loader1.loadClass("com.r09er.jvm.classloader.Test01");
        //打印加载的类
        System.out.println("loader1 load class" + aClass.hashCode());
        Object instance = aClass.newInstance();
        System.out.println("instance1: " + instance);


        Test16 loader2 = new Test16("loader2");
        //设置绝对路径,加载工程根目录下的Test01.class
        loader2.setPath("/Users/cicinnus/Documents/sources/jvm-learning/");
        Class<?> aClass2 = loader2.loadClass("com.r09er.jvm.classloader.Test01");
        System.out.println("loader2 load class" + aClass2.hashCode());
        Object instance2 = aClass2.newInstance();
        System.out.println("instance2 : " + instance2);

        //todo ****
        //1.重新编译工程,确保默认的classPath目录下有Test01.class的字节码文件,然后运行main方法,观察输出
        //2.删除默认classpath目录下的Test01.class,运行main方法,观察输出

    }


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        System.out.println("invoke findClass");
        System.out.println("class loader name : " + this.classLoaderName);
        byte[] bytes = this.loadClassData(name);
        return super.defineClass(name, bytes, 0, bytes.length);
    }

    private byte[] loadClassData(String binaryName) {
        byte[] data = null;

        binaryName = binaryName.replace(".", "/");

        try (
                InputStream ins = new FileInputStream(new File(this.path + binaryName + this.fileExtension));
                ByteArrayOutputStream baos = new ByteArrayOutputStream();

        ) {
            int ch;
            while (-1 != (ch = ins.read())) {
                baos.write(ch);
            }
            data = baos.toByteArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }

}
