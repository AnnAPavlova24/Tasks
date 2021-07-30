package com.company;

import java.util.Locale;

public class Task6 {
    public static boolean isPalindrome(String input) {
        String upperCase = input.toUpperCase(Locale.ROOT);
        final String cleaned = upperCase.replaceAll("\\W", "");
        final String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }
}
