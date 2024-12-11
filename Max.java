package org.example;

public class Max{
    private int a;
    private int b;
    private int c;
    private int d;

    public Max(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public void mmaaxx() {
        System.out.println(Math.max(Math.max(a,b),Math.max(c,d)));
    }
}