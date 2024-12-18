import java.util.Scanner;

public class vuz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Числа");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int max = a; 
        if (b > max) max = b;
        if (c > max) max = c;
        if (d > max) max = d;

        System.out.println("max значение это: " + max);

        scanner.close();
    }
}
