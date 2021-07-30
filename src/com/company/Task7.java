package com.company;

import java.math.BigInteger;

public class Task7 {
    public static BigInteger factorialCalculate(int n) {
        BigInteger factorial = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;

    }
}
