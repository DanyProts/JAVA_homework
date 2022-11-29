package org.example;

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
        int first=10;
        int second=20;
        int third=32;
        int fourth=29;
        if(first>=second && first>=third && first>=fourth){
            System.out.prinln(first);
        }
        else if(second>=third && second>=fourth) {
            System.out.prinln(second);
        }
        else if (third>=fourth) {
            System.out.println(third);
        }
        else{
            System.out.println(fourth);
        }
    }
}