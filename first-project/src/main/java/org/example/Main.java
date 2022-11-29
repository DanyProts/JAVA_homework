package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 100, 4};
        Arrays.sort(a);
        System.out.println("Максимальное число: " + a[3]);
    }
}