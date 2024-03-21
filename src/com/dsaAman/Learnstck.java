package com.dsaAman;

import java.util.Stack;

public class Learnstck {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("Tiger");
        animals.push("Lion");
        animals.push("Goat");
        animals.push("Eagle");

        System.out.println("Stack: "+ animals);

        System.out.println(animals.peek());
        animals.pop();
        System.out.println(animals);
    }
}
