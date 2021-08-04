package com.company;

public class Task13 {
    public static double findSqrt (double input) {
        if (input<0){
            throw new IllegalArgumentException("Expected non-negative number, got "+ input);
        } else {
            return Math.sqrt(input);
        }
    }
    public static void main(String[] args) {
        final double sqrt = findSqrt(5);
        System.out.println(sqrt);

    }
}
