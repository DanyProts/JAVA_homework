import java.util.Scanner;  // Import the Scanner class

public class Main {
    public static void main (String[] args){
        int[] numbers = {0, 0, 0, 0};

        Scanner in = new Scanner(System.in);


        numbers[0] = in.nextInt();
        numbers[1] = in.nextInt();
        numbers[2] = in.nextInt();
        numbers[3] = in.nextInt();

        int mini = numbers[0];

        for (int i = 0; i<4; i+=1){
            //System.out.println(numbers[i]);
            if (numbers[i] < mini){
                mini = numbers[i];
            } 
        }

        System.out.println(mini);
    }
}