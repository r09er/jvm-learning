package com.r09er.jvm.classloader;

import java.util.UUID;

/**
 * @author roger
 * @date 2020/3/11
 */
public class Test04 {
    public static void main(String[] args) {
        System.out.println(Parent4.str);
    }
}

class Parent4 {
    public static final String str = UUID.randomUUID().toString();

    static {
        System.out.println("parent4 static block");
    }
}
