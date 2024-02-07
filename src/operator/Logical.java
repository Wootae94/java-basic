package operator;

public class Logical {
    public static void main(String[] args) {
        System.out.println("&&: AND 연산");
        System.out.println(true);
        System.out.println(false);
        System.out.println(false);

        System.out.println("||: OR 연산");
        System.out.println(true);
        System.out.println(true);
        System.out.println(false);

        System.out.println("!: OR 연산");
        System.out.println(false);
        System.out.println(true);

        System.out.println("변수활용");
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);

        int i = 15;
        boolean result = i > 10 && i < 20;
        System.out.println("result = " + result);
    }

}
