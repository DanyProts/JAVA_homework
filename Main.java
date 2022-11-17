package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int a = 799;
        int b = 2000;
        int c = -2000;
        int d = -44;
        if ((a > b) & (a > c) & (a > d)) {
            System.out.println(a);
        } if ((b > a) & (b > c) & (b > d)) {
            System.out.println(b);
        }
        if ((c > a) & (c > b) & (c > d)) {
            System.out.println(c);
        }
        if ((d > a) & (d > c) & (d > b)) {
            System.out.println(d);
        }
    }}