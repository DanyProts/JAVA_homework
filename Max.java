package org.example;

public class Max {
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
        public void mmax(){
            if (a<b && b<c && c<d){
                System.out.println(d);
            }
            else if (a<c && c<d && d<b){
                System.out.println(b);
            }
            else if (a<b && b<d && d<c){
                System.out.println(c);
            }
            else if (b<c && c<d && d<a){
                System.out.println(a);
            }
        }
}
