package com.ssm.test;

public class Singleton2 {
    private static Singleton2 instacne;
    private Singleton2(){}
    public static Singleton2 getInstacne(){
        if(instacne == null){
            return new Singleton2();
        }
        return instacne;
    }

}
