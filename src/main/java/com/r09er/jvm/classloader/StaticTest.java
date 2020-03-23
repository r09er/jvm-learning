package com.r09er.jvm.classloader;

/**
 * @author roger
 * @date 2020/3/17
 */
public class StaticTest {

    static {
        System.out.println("static block");
    }

    public StaticTest() {
        System.out.println("construct");
    }

    public static void doSomething(){
        System.out.println("do something");
    }


}
class TestClass{
    public static void main(String[] args) {
        StaticTest.doSomething();
    }
}
