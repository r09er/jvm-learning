package com.r09er.jvm.classloader;

/**
 * @author roger
 * @date 2020/3/18
 */
public class Test25 implements Runnable {

    private Thread thread;

    public Test25() {
        this.thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        ClassLoader classLoader = this.thread.getContextClassLoader();

        this.thread.setContextClassLoader(classLoader);

        System.out.println("Class " + classLoader.getClass());
        System.out.println("Parent " + classLoader.getParent().getClass());


    }

    public static void main(String[] args) {
        new Test25();
    }
}
