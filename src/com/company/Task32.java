package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Task32 {
    public static void getChangeList() {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
// Разбиение строки на массив по пробелам
        var strings = line.split("\\s");
        var integers = new ArrayList<Integer>();

        for (int i = 0; i < strings.length; i++) {
            if (i % 2 != 0) {
                integers.add(Integer.parseInt(strings[i]));
            }

        }
        for (int i = integers.size()-1; i >=0 ; i--) {
            System.out.print(integers.get(i)+ " ");

        }
    }
}
