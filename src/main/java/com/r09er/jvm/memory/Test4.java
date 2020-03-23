package com.r09er.jvm.memory;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 方法区内存溢出demo
 * 设置jvm参数:-XX:MaxMetaspaceSize=16m
 *
 * Exception in thread "main" java.lang.OutOfMemoryError: Metaspace
 * @author roger
 * @date 2020/3/22
 */
public class Test4 {

    public static void main(String[] args) {
        for (;;){
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(Test4.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    return methodProxy.invokeSuper(o,objects);
                }
            });
            System.out.println("hello world");
            enhancer.create();
        }
    }
}
