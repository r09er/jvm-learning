package com.r09er.jvm.classloader;

/**
 * 该帮助深入理解类在连接-准备阶段和初始化阶段所做的功能
 * @author roger
 * @date 2020/3/11
 */
public class Test07 {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("counter1=="+Singleton.counter1);
        System.out.println("counter2=="+Singleton.counter2);
    }
}

class Singleton {
    public static int counter1=1;


    private static Singleton singleton = new Singleton();

    private Singleton(){
        //已经被初始化了
        counter1++;
        //由于counter还在后面,还未进行初始化,所以用的是准备阶段的默认值0
        counter2++;
        System.out.println("construct counter1=="+counter1);
        System.out.println("construct counter2=="+counter2);
    }

    /**
     * 当类初始化执行到这步,counter2会被重新赋值为0
     */
    public static int counter2 = 0;


    public static Singleton getInstance(){
        return singleton;
    }
}