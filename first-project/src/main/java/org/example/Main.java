package org.example;
import java.util.ArrayList;

public class Main {

    public static void maximum(int first, int second, int third, int fourth) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(first);
        numbers.add(second);
        numbers.add(third);
        numbers.add(fourth);
        int max = first;
        for (Integer number : numbers) {
            if (number > max) max = number;
        }
        System.out.println(max);
    }

    public static void main(String[] args) {

        maximum(1,2,-3,10);

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

    }
}