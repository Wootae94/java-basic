package classNInstance;

// 객체 = 설계도, 시스템적으론 하나의 데이터타입을 만드는 것과 동일하다.
class Calculator {
    // 인스턴스 변수. 인스턴스마다 다르게 가지고 있는 변수.
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

class Calculator2 {
    // 클래스 변수. 모든 인스턴스가 공유하는 변수.
    // 인스턴스에 따라 변하지 않는 값이 필요할 때 >> final
    // 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우
    // 값의 변경사항을 모든 인스턴스가 공유해야하는 경우

    static int base = 0;

    // 인스턴스 변수. 인스턴스마다 다르게 가지고 있는 변수.
    int left, right;

    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right + base);
    }

    public void avg() {
        System.out.println((this.left + this.right) / 2 + base);
    }
}

class Calculator3 {
    // 클래스 메소드
    public static void sum(int left, int right) {
        System.out.println(left + right);
    }

    public static void avg(int left, int right) {
        System.out.println((left + right) / 2);
    }
}

public class ClassNInstance {
    public static void main(String[] args) {
        // 인스턴스 = 상태(변수)와 행위(메소드)를 가지는 구체적인 제품.
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();
        c2.setOprands(20, 40);
        c2.sum();
        c2.avg();


        // 클래스 변수 사용
        Calculator2.base = 10;
        Calculator2 c3 = new Calculator2();
        c3.setOprands(30, 60);
        c3.sum();
        c3.avg();

        // 클래스 메소드 사용
        Calculator3.sum(10,20);
        Calculator3.avg(10,20);

        // 인스턴스 메소드는 클래스 멤버에 접근 할 수 있다.
        // 클래스 메소드는 인스턴스 멤버에 접근 할 수 없다.
    }


}
