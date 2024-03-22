package com.dsaAman;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMaps {
    public static void main(String[] args) {

        //Map<String, Integer> numbers = new HashMap<>();
        Map<String, Integer> numbers = new TreeMap<>();
        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        System.out.println(numbers);

        System.out.println(numbers.remove("Four"));

        System.out.println(numbers.containsValue(4));

        System.out.println(numbers);

        /*for (Map.Entry<String, Integer> e : numbers.entrySet()) {
            System.out.println(e);

            //System.out.println(e.getKey());

            //System.out.println(e.getValue());
        }
*/
        /*for (String Keys: numbers.keySet()) {
            System.out.println(Keys);
        }
        *//*numbers.put("Three", 30);

        System.out.println(numbers);*//*

        for (Integer values: numbers.values()) {
            System.out.println(values);
        }*/

    }
}
