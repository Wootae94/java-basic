package operator;

public class Operator {
    public static void main(String[] args) {
        // 사칙연산
        int a = 10;
        int b = 2;

        int sum = a + b;
        int subs = a - b;
        int multi = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println(sum);
        System.out.println(subs);
        System.out.println(multi);
        System.out.println(div);
        System.out.println(mod);

        // 문자열 더하기
        String result = "Hello" + "world";
        System.out.println(result);

        String s1 = "Hello";
        String s2 = "world";
        int i1 = 1000;
        System.out.println(s1 + s2);

        System.out.println(s1 + s2 + 100);

        System.out.println(s1 + s2 + i1);

        int sum1 = 1 + 2 * 3;
        int sum2 = (1 + 2) * 3;

        System.out.println(sum1);
        System.out.println(sum2);

    }
}
