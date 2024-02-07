package operator;

public class OperatorAddSubs {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        a = a + 1;
        System.out.println("a = " + a);

        ++a;
        System.out.println("a = " + a);

        --a;
        System.out.println("a = " + a);

        a = 1;
        b = ++a;
        System.out.println("a = " + a + " b = " + b);

        a = 1;
        b = 0;

        b = a++;
        System.out.println("a = " + a + " b = " + b);

    }
}
