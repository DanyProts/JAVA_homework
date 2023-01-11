public class Main {
    //generate 4 random integers and find biggest of them
    public static void main(String[] args) {
        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        int d = (int) (Math.random() * 100);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (d > max) {
            max = d;
        }
        System.out.println("max = " + max);
    }
}