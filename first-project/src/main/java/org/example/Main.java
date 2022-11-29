package org.example;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите четрыре целых числа:");
        int numbers[], max =0;
        numbers = new int[4];

        for (int i=0; i<4; i++){
            numbers[i] = in.nextInt();
            if (i == 0) max = numbers[i];
            if (max < numbers[i]) max = numbers[i];
        }

        System.out.println("Максимальное число:");
        System.out.println(max);
    }
}