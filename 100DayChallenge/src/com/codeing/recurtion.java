package com.codeing;

public class recurtion {
    public static Integer fact(Integer i){
        if(i==0){
            return 1;
        }
        return i * fact(i-1);
    }
}
