import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a1=scan.nextInt();
        System.out.println("Введите второе число:");
        int a2=scan.nextInt();
        System.out.println("Введите третье число:");
        int a3=scan.nextInt();
        System.out.println("Введите четвертое число:");
        int a4=scan.nextInt();
        int max=-2147483648;
        if (max<a1) {
            max=a1;}
        if (max<a2) {
            max=a2;}
        if (max<a3) {
            max=a3;}
        if (max<a4) {
            max=a4;}
        System.out.println("Максимальное число:"+max);
        }
    }


