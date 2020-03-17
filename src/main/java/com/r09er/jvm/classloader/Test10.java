package com.r09er.jvm.classloader;

/**
 * 类初始化深入理解的demo
 *
 * @author roger
 * @date 2020/3/12
 */
public class Test10 {
    static {
        System.out.println("Test10 static block");
    }

    public static void main(String[] args) {
        Parent10 parent10;
        System.out.println("-------");
        parent10 = new Parent10();
        System.out.println("-------");
        System.out.println(parent10.a);
        System.out.println("-------");
        System.out.println(Child10.b);

        ///----,parent10 block,---2,---,child10 block,3
    }
}

class Parent10 {
    static int a = 2;

    static {
        System.out.println("Parent10 static block");
    }
}

class Child10 extends Parent10 {
    static int b = 3;

    static {
        System.out.println("Child10 static block");
    }
}