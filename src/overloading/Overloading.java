package overloading;

public class Overloading {
    public static void main(String[] args) {
        // overloading : 메소드 명이 같더라도 메소드 시그니처가 다르면 된다.
        int sum1 = add(1, 2);
        System.out.println("sum1 = " + sum1);
        int sum2 = add(1, 2, 3);
        System.out.println("sum2 = " + sum2);
        double sum3 = add(1.2, 2.1);
        System.out.println("sum3 = " + sum3);
    }

    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }

    public static double add(double a, double b) {
        System.out.println("3번 호출");
        return a + b;
    }
}
