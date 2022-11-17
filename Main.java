package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(get_max(1, 5, 3, 4));

    }
    private static int get_max(int a, int b, int c, int d){
        int ab = a>b?a:b;
        int cd = c>d?c:d;
        return cd>ab?cd:ab;
    }
}