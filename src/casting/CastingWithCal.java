package casting;

public class CastingWithCal {
    public static void main(String[] args) {
        // 같은 타입끼리의 계산은 같은 타입의 값이 나온다.
        int div1 = 3 / 2;
        System.out.println("div1 = " + div1);


        double div2 = 3 / 2; // int타입인 1이 먼저 계산되고 double로 형변환 : 1.0
        System.out.println("div2 = " + div2);

        // 다른 타입끼리의 계산은 더 넓은 범위로 자동 형변환이 된다.
        double div3 = 3.0 / 2;
        System.out.println("div3 = " + div3);


        double div4 = (double) 3 / 2;
        System.out.println("div4 = " + div4);

        int a = 3;
        int b = 2;
        double result = (double) a / b;
        System.out.println("result = " + result);
    }
}
