package condition;

public class If {
    public static void main(String[] args) {
        int age1 = 20;
        if (age1 >= 20) {
            System.out.println("성인입니다.");
        }
        if (age1 < 20) {
            System.out.println("미성년자입니다.");
        }

        int age2 = 15;
        if (age2 >= 20) {
            System.out.println("성인입니다.");
        } else {
            System.out.println("미성년자입니다.");
        }

        int age3 = 14;

        if (age3 <= 7) {
            System.out.println("미취학");
        } else if (age3 <= 13) {
            System.out.println("초등학생");
        } else if (age3 <= 16) {
            System.out.println("중학생");
        } else if (age3 <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }

        // 독립조건인 경우, If 따로 사용
        int price = 10000;
        int customerAge = 10;
        int discount = 0;

        if (price >= 10000) {
            discount += 1000;
            System.out.println("discount = " + discount);
        }

        if (customerAge <= 10) {
            discount += 1000;
            System.out.println("discount = " + discount);
        }

        System.out.println("총 할인금액: " + discount);

        if (true) System.out.println("if문 블럭 생략가능. 단, 1줄만 실행");

    }
}
