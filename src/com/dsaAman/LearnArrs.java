package com.dsaAman;

import java.util.Arrays;

public class LearnArrs {
    public static void main(String[] args) {

        Integer[] numbers = {10, 24, 18, 56, 37, 78, 17};

        Arrays.sort(numbers);

        Arrays.fill(numbers, 12);

        for (int  i : numbers) {
            System.out.println(i+" ");
        }

    }
}
