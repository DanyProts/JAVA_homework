import java.util.Scanner;





public class Main {
    public  static  int Max(int ... args){
        int max = args[0];
        for (int i: args) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Input your numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println(Max(a, b, c, d));
    }
}

//