package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        final boolean test = Task1.test(true, false, false, false);
        System.out.println(test);
        final int yearsCount = Task2.leapYearsCount(100);
        System.out.println(yearsCount);
        final char convert = Task4.convert(29);
        System.out.println(convert);
        final boolean test1 = Task5.test(6);
        System.out.println(test1);
        final boolean palindrome = Task6.isPalindrome("Madam, I'm Adam!");
        System.out.println(palindrome);
        final int i = Task3.flipBit(34, 5);
        System.out.println(i);
        final BigInteger bigInteger = Task7.factorialCalculate(3);
        System.out.println(bigInteger);
        // write your code here
    }
}
