package com.emirates.kotlintest.utils;

public class Factorial {
    private Factorial() {
        //Private constructor to prevent instance creation
    }

    public static int calc(int num) {
        if (num < 2) {
            return 1;
        } else {
            return num * calc(num - 1);
        }
    }

    public static long calc(long num){
        if (num < 2) {
            return 1;
        } else {
            return num * calc(num - 1);
        }
    }
}
