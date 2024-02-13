package method;

public class MethodCasting {
    public static void main(String[] args) {
        double number =1.5;
        //printNumber(number);
        printNumber((int) number); // double을 int로 명시적 형변환

        int number2 = 1;
        printNumber2(number2); // int에서 double로 자동형변환
    }

    public static void printNumber(int n) {
        System.out.println("숫자 n = " + n);
    }

    public static void printNumber2(double n) {
        System.out.println("숫자 n = " + n);
    }
}
