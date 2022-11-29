package org.example;

public class Main {
    public static void main(String[] args) {
        int a1 = 1, a2 = 2, a3 = 3, a4 = 4;
        int m = -1000;

        if(a1 > m){
            m = a1;
        }
        if(a2 > m){
            m = a2;
        }
        if(a3 > m){
            m = a3;
        }
        if(a4 > m){
            m = a4;
        }

        System.out.println(m);
    }
}