package com.r09er.jvm.classloader;

/**
 * 这个例子可以观察到,即使通过Child11调用a属性和方法,但是依然是对其父类的主动使用
 *
 * @author roger
 * @date 2020/3/13
 */
public class Test11 {

    public static void main(String[] args) {
        System.out.println(Child11.a);
        System.out.println("------");
        Child11.doSomething();
    }
}

class Parent11 {
    static int a = 3;

    static {
        System.out.println("Parent11 static block");
    }

    static void doSomething() {
        System.out.println("Parent11 do something");
    }
}

class Child11 extends Parent11 {
    static {
        System.out.println("Child11 static block");
    }
}
