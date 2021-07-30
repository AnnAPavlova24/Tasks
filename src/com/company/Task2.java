package com.company;

public class Task2 {
    public static int leapYearsCount(int year) {
        return year / 4 - year / 100 + year / 400;
    }
}
