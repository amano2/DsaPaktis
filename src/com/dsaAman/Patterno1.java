package com.dsaAman;

public class Patterno1 {
    public static void main(String[] args) {
        int n=4;
        //pattern1(n);
        //System.out.println("-------------");
        //pattern2(n);
        //pattern3(n);
        pattern4(n);
    }

    static void pattern4(int n) {
        for (int i = 1; i <= 2*n-1; i++) {
                int totalCol = i > n ? 2*n-i : i;
            for (int j = 1; j <= totalCol ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j=1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}
