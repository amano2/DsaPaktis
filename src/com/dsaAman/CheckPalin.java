package com.dsaAman;

public class CheckPalin {
    public static boolean isPalindrome(int x) {
        int rev = 0;
        int temp = x;
        while (temp > 0) {
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;
        }
        return rev == x;
    }

    public static void main(String[] args) {
        int n = -121;

        System.out.println(isPalindrome(n));
    }

}
