public class Main {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3, d = 4, m1, m2;
        if (a >= b) {
            m1 = a;
        } else {
            m1 = b;
        }
        if (c >= d) {
            m2 = c;
        } else {
            m2 = d;
        }
        if (m1 >= m2) {
            System.out.println(m1);
        } else {
            System.out.println(m2);
        }
    }
}