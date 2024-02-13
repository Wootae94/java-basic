package method;

public class Method {
    public static void main(String[] args) {
        printHeader();
        int sum1 = add(1, 2);
        System.out.println("결과 = " + sum1);
        int sum2 = add(10, 20);
        System.out.println("결과 = " + sum2);
        boolean odd = odd(21);
        System.out.println("odd = " + odd);
        checkAge(17);
        printFooter();
    }

    public static int add(int a, int b) {
        System.out.println(a + " + " + b + " 연산 수행");

        return a + b;
    }

    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkAge(int age) {
        if (age<18) {
            System.out.println("미성년자는 입장이 불가합니다. age = " + age);
            return;
        } else {
            System.out.println("입장이 가능합니다. age = " + age);
            return;
        }
    }

    public static void printHeader() {
        System.out.println("===프로그램을 실행합니다.===");
    }

    public static void printFooter() {
        System.out.println("===프로그램을 종료합니다.===");
    }


}
