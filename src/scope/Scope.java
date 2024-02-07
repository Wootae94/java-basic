package scope;

public class Scope {
    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if (true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x 생존 종료
        // System.out.println("main x = " + x); -> x를 찾을 수 없다는 오류가 생김.
        System.out.println("main m = " + m);

        for (int i = 0; i <= 2; i++) {
            System.out.println("for i = " + i);
            System.out.println("for m = " + m);
        } // i 생존 종료
        // System.out.println("main i = " + i); -> i를 찾을 수 없다는 오류가 생김.

        //int temp = 0; // 불필요하게 넓은 스코프를 가진 변수. 비효율적인 메모리사용 및 코드 복잡성 증가
        if (m > 0) {
            int temp = m * 2; // 유효하게 스코프를 변경
            System.out.println("temp = " + temp);
        }
        // System.out.println("main temp = " + temp); -> temp를 찾을 수 없다는 오류가 생김.

        System.out.println("m = " + m);
    }
}
