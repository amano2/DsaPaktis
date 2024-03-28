package com.dsaAman;

import java.util.Scanner;
import java.util.*;

public class ArmsSt {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        if(isArmstrong(n)){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not");
        }
    }

    static boolean isArmstrong(int num) {
        String str = Integer.toString(num);
        int order = str.length();
        int ognum=num;
        int armNum=0;
        while(num!=0){
            int digit =num%10;
            armNum+= Math.pow(digit, order);
            num/=10;
        }
        return ognum==armNum;
    }
}
