package com.why.interfaceupgrade;

public interface Demo02 {

    void test01();

    default void test02(){
        System.out.println("默认 方法");
    }

    static void test03(){
        System.out.println("静态方法");
    }
}

