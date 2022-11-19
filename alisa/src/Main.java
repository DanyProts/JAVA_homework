import java.util.Scanner;


class Main {


    public static void main(String[] args) {

        System.out.println("Enter 4 numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = Math.max(a, b);
        int g = Math.max(c, d);


        System.out.println(Math.max(e, g));


        sc.close();



    }


}
