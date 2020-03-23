package com.r09er.jvm.classloader;

import java.lang.reflect.Method;

/**
 * @author roger
 * @date 2020/3/17
 */
public class Test20 {

    public static void main(String[] args) throws Exception {
        Test16 loader1 = new Test16("loader1");
        loader1.setPath("/Users/cicinnus/Documents/sources/jvm-learning/");
        Test16 loader2 = new Test16("loader2");
        loader2.setPath("/Users/cicinnus/Documents/sources/jvm-learning/");

        Class<?> class1 = loader1.loadClass("com.r09er.jvm.classloader.Person");
        Class<?> class2 = loader2.loadClass("com.r09er.jvm.classloader.Person");

        System.out.println("class1 classloader : " + class1.getClassLoader());
        System.out.println("class2 classloader : " + class2.getClassLoader());

        //两个类是否相等
        System.out.println(class1 == class2);


        Object person1 = class1.newInstance();
        Object person2 = class2.newInstance();
        //两个对象是否相等
        System.out.println(person1 == person2);

        //第一次,不删除编译后的Person.class文件,调用方法,正常输出
        //第二次,将编译后的Person.class文件删除
        //异常信息
        //Exception in thread "main" java.lang.reflect.InvocationTargetException
        //	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        //	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        //	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        //	at java.lang.reflect.Method.invoke(Method.java:498)
        //	at com.r09er.jvm.classloader.Test20.main(Test20.java:35)
        //Caused by: java.lang.ClassCastException: com.r09er.jvm.classloader.Person cannot be cast to com.r09er.jvm.classloader.Person
        //	at com.r09er.jvm.classloader.Person.setPerson(Person.java:11)
        //	... 5 more
        Method method = class1.getMethod("setPerson", Object.class);
        method.invoke(person1, person2);

    }
}

