package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Max test = new Max(1,2,3,4);
        Max test1 = new Max(1,2,5,4);
        Max test2 = new Max(1,6,3,4);
        Max test3 = new Max(7,2,3,4);
        test.mmax();
        test2.mmax();
        test3.mmax();
        test1.mmax();
    }
}