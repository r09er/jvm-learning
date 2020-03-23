package com.r09er.jvm.classloader;

/**
 * 用于理解类加载器命名空间的类
 *
 * @author roger
 * @date 2020/3/17
 */
public class Person {
    private Person person;

    /**
     * 如果这个地方的参数写成Person,那么在获取构造方法时候就已经出错,所以需要用Object强行赋值
     *
     * @param person
     */
    public void setPerson(Object person) {
        this.person = (Person) person;
    }
}