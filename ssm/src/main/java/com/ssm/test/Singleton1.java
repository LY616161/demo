package com.ssm.test;

public class Singleton1 {
    private static Singleton1 instance = new Singleton1();
    private Singleton1(){}
    public static Singleton1 getSingleton1(){
        return instance;
    }
}
