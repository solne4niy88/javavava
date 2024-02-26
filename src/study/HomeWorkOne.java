package study;

public class HomeWorkOne {
    static void number(int a, int b){
        if (a+b >= 10 && a+b <=20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
    static int result(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }
    public static void main(String[] args) {
        number(10,99);
        result(10,15,36,59);
    }
}

