import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int a,b,c,d;
        a = console.nextInt();
        b = console.nextInt();
        c = console.nextInt();
        d = console.nextInt();

        int mx = findMax(a,b,c,d);
        System.out.println(mx);
    }
    public static int findMax(int a, int b, int c, int d){
        return Math.max(Math.max(a,b),Math.max(c,d));
    }
}




