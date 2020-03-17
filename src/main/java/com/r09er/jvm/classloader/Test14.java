package com.r09er.jvm.classloader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @author roger
 * @date 2020/3/13
 */
public class Test14 {

    public static void main(String[] args) throws IOException {
        //获取当前线程的上下文类加载器
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        String resourceName = "com/r09er/jvm/classloader/Test13.class";
        Enumeration<URL> enumeration = classLoader.getResources(resourceName);


        while (enumeration.hasMoreElements()) {
            URL url = enumeration.nextElement();
            System.out.println(url);
        }


        System.out.println("-------");
        //自己定义的类,默认都是由AppClassLoader加载
        Class test14Class = Test14.class;
        System.out.println(test14Class.getClassLoader());
        //rt包的类都是由BootStrapClassloader加载,但是由于不是Java实现,所以会返回null
        Class<String> stringClass = String.class;
        System.out.println(stringClass.getClassLoader());
    }
}
