package com.emirates.kotlintest;

import com.emirates.kotlintest.utils.Factorial;

public class Main {
    private Main(){
        //Private constructor to prevent instance creation
    }
    public static void main(String[] args) {
        int fact = Factorial.calc(5);
        System.out.printf("Factorial of %d is %d%s",5,fact,System.lineSeparator());
    }
}
