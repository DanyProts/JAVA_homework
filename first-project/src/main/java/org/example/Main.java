public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        int max = Math.max(Math.max(a, b), Math.max(c, d));
        System.out.println("Максимальное число: " + max);
    }
}
