package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[4];
        for (int i = 0; i < 4; ++i) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.stream(arr).max());
    }
}