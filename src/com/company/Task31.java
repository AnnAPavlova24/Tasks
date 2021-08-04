package com.company;

import java.util.HashSet;
import java.util.Set;

public class Task31 {
    public static Set<Integer> getRetainSet(Set<Integer> set1, Set<Integer> set2) {
        var set1copy = new HashSet<>(set1);
        var set2copy = new HashSet<>(set2);
        set1copy.removeAll(set2);
        set2copy.removeAll(set1);
        set1copy.addAll(set2copy);
        return set1copy;
    }
}
