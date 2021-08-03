package com.company;

import java.util.*;

public class Task35 {
    public static void main(String[] args) {
        var arrayList = new ArrayList<Integer>();
        var linkedList = new LinkedList<Integer>();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        var started1 = System.currentTimeMillis();
        testGet(arrayList);
        var finished1 = System.currentTimeMillis();
        var arrayListTime = finished1 - started1;
        var started2 = System.currentTimeMillis();
        System.out.println("Время выполнения для ArrayList " + arrayListTime);
        testGet(linkedList);
        var finished2 = System.currentTimeMillis();
        var linkedListTime = finished2 - started2;
        System.out.println("Время выполнения для LinkedList " + linkedListTime);
    }

    public static void testGet(List<Integer> collection) {
        for (int i = 0; i < 10000; i++) {
            var random = new Random();
            var randomIndex = random.nextInt(collection.size());
            collection.get(randomIndex);
        }
    }
}
