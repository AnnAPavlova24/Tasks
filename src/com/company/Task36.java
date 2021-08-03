package com.company;

import java.util.*;

public class Task36 {
    public static HashMap<String, Collection<String>> convertMap(Map<String, String> input) {
        var hashMap = new HashMap<String, Collection<String>>();
        // Возвращает Set пар ключ-значение
        var entries = input.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            hashMap.computeIfAbsent(entry.getValue(), s -> new ArrayList<>())
                    .add(entry.getKey());
        }

        return hashMap;
    }

    public static void main(String[] args) {
        var stringStringHashMap = new HashMap<String, String>();
        stringStringHashMap.put("text", "text");
        stringStringHashMap.put("text2", "text");
        stringStringHashMap.put("23", "32454");

        var hashMap = convertMap(stringStringHashMap);


    }
}
