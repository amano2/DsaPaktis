package com.dsaAman;

public class CheckFreq {
    static int checkfreq(int num,int t){
        int count = 0;
        while(num!=0){
            int digit=num%10;
            if(digit==t){
                count++;
            }
            num/=10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=13893;
        int tar=3;
        int frequency= checkfreq(n,tar);
        System.out.println(frequency);
    }
}
