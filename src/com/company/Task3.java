package com.company;

public class Task3 {
    public static int flipBit(int input, int index) {
        final String binaryString = Integer.toBinaryString(input);
        final char[] chars = binaryString.toCharArray();

        final char charAtIndex = chars[chars.length - index];
        final char replacement = charAtIndex == '0' ? '1' : '0';

        chars[chars.length - index] = replacement;

        final String resultBinaryString = new String(chars);
        return Integer.parseInt(resultBinaryString, 2);
    }
}
