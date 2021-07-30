package com.company;

public class Task1 {
    public static boolean test(boolean a, boolean b, boolean c, boolean d) {
        if ((a ^ b) && (c ^ d)) {
            return true;
        } else if ((a && b) && !(c || d)) {
            return true;
        } else if ((c && d) && !(a || b)) {
            return true;
        }
        return false;
    }
}
