package com.r09er.jvm.classloader;

/**
 * main方法,主动使用类加载,所以会优先加载主函数的类
 *
 * @author roger
 * @date 2020/3/12
 */
public class Test09 {

    static {
        System.out.println("Test09 static block");
    }

    public static void main(String[] args) {
        System.out.println(Child9.b);
    }
}

class Parent9 {
    static int a = 5;

    static {
        System.out.println("parent9 static block");
    }
}


class Child9 extends Parent9 {
    static int b = 6;

    static {
        System.out.println("child9 static block");
    }
}

