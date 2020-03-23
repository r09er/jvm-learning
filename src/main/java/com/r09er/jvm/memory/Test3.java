package com.r09er.jvm.memory;

import java.util.concurrent.TimeUnit;

/**
 * 死锁及jconsole使用
 * @author roger
 * @date 2020/3/22
 */
public class Test3 {


    public static void main(String[] args) {
        new Thread(() -> DeadLockClass.deadLockMethod1()).start();
        new Thread(() -> DeLockCLass2.deadLockMethod2()).start();

    }

}

class DeadLockClass {

    public static synchronized void deadLockMethod1() {
        System.out.println("deadLockMethod 1 ");
        try {
            TimeUnit.SECONDS.sleep(5);
            DeLockCLass2.deadLockMethod2();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class DeLockCLass2 {

    public static synchronized void deadLockMethod2() {
        System.out.println("deadLockMethod 2");

        try {
            TimeUnit.SECONDS.sleep(5);
            DeadLockClass.deadLockMethod1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}