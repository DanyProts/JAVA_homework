public class Main {
    public static void main(String[] args) {
        int a=1,b=2,c=3,d=4;
        if(a>b & a>c & a>d) System.out.println("а самое большое");
        if(b>a & b>c & b>d) System.out.println("b самое большое");
        if(c>b & c>b & c>d) System.out.println("c самое большое");
        if(d>b & d>c & d>a) System.out.println("d самое большое");
    }
}