package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = -1;
        int b = 2;
        double d = 2.2;
        float f = 2.2f;
        String s = "just-string";
        boolean l = true;
//        System.out.println(a + b);

//        if (a > 0) {
//            System.out.println(a);
//        }else{
//            System.out.println("a<=0");
//        }
//        int i = 0;
//        while(i < 10){
//            System.out.println(i);
//            i++;
//        }

        Human human = new Human(30, 180);
        Human human1 = new Human(29, 179);
        Human baby1 = new Human(55);


        System.out.println(baby1.olderThan18());
        System.out.println(human.getAge());
///////////////////////////////////
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 =in.nextInt();
        int num4 = in.nextInt();
        System.out.println(Math.max(num1,Math.max(num2,Math.max(num3,num4))));
    }
}