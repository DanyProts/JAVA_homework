package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите четыре числа");

        int n = 4;
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]=in.nextInt();
        }

        int max= a[0];
        for (int i=1;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
        }

        System.out.println("Максимум: "+max);
    }
}