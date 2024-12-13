import java.util.Scanner;

public class Program{

    public static void main (String args[]){

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();

        if(num2>num1){
            num1=num2;
        }
        if(num3>num1){
            num1=num3;
        }
        if(num4>num1){
            num1=num4;
        }
        System.out.println("The biggest number is " + num1);
    }
}
