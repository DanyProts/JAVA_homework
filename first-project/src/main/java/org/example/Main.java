package org.example;

import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        int a =10;
        int b =11;
        int c =12;
        int d =13;
        int maxNumber1 = Math.max(a,d);
        int maxNumber2 = Math.max(b,c);
        int maxNumber = Math.max(maxNumber1,maxNumber2);
        System.out.println(maxNumber);
    }
}