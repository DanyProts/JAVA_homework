package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int a1 = 72;
        int a2 = -19;
        int a3 = 21;
        int a4 = 17;
        ArrayList arr = new ArrayList<Integer>();
        arr.add(a1);
        arr.add(a2);
        arr.add(a3);
        arr.add(a4);
        int maximum = (int) Collections.max(arr);

        System.out.println(maximum);
    }
}