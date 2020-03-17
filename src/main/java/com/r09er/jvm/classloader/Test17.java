package com.r09er.jvm.classloader;

/**
 * @author roger
 * @date 2020/3/16
 */
public class Test17 {

    public Test17() {
        System.out.println("Test17 loaded by " + this.getClass().getClassLoader());

        new SubClass();
    }

    public static void main(String[] args) {
        Test16 loader1 = new Test16("loader1");
    }
}

class SubClass {
    public SubClass() {
        System.out.println("SubClass loaded by " + this.getClass().getClassLoader());
    }
}