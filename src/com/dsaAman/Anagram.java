package com.dsaAman;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static void main(String[] args) {
        String st = "anagram";
        String tt = "nagaram";
        System.out.println(isAnagram(st, tt));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<String, Integer> var = new HashMap<>();
        for (char x : s.toCharArray()) {
            var.put(String.valueOf(x), var.getOrDefault(String.valueOf(x),0)+1);
        }

        for (char x : t.toCharArray()) {
            var.put(String.valueOf(x), var.getOrDefault(String.valueOf(x),0)-1);
        }

        for (int val : var.values()) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}