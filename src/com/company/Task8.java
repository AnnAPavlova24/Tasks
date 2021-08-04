package com.company;

import java.util.Arrays;

public class Task8 {
    public static int[] mergeArrays(int[] a1, int[] a2) {
        int[] result = new int[a1.length + a2.length];

        int[] largestArray = a1.length > a2.length ? a1 : a2;
        int[] littleArray = a1.length < a2.length ? a1 : a2;
        int j = 0;
        int n = 0;

        for (int i = 0; i < largestArray.length; i++) {
            if (largestArray[i] < littleArray[j]) {
                result[n++] = largestArray[i];
            } else {
                while (largestArray[i] > littleArray[j] && j < littleArray.length - 1) {
                    result[n++] = littleArray[j];
                    j++;
                }
                if (largestArray[i] == littleArray[j]) {
                    result[n++] = largestArray[i];
                    result[n++] = littleArray[j];
                } else {
                    result[n++] = largestArray[i];
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        final int[] ints = mergeArrays(new int[]{3, 4, 8, 10, 12, 15}, new int[]{5, 9, 11, 12});
        System.out.println(Arrays.toString(ints));
    }
}
