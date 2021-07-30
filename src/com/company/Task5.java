package com.company;

public class Task5 {
    public static boolean test(int a) {
        final int abs = Math.abs(a);
        return Integer.bitCount(abs) == 1;
    }

}

