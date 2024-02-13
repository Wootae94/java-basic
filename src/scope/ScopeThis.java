package scope;

class C {
    // class C 의 인스턴스 전역변수
    int v = 10;

    void m() {
        // 동일한 v지만 이것은 m() 메소드 내부 지역변수.
        int v = 20;
        // 기본적으론 지역변수에 우션순위가 있음.
        System.out.println(v);
        // this > 인스턴스 자체를 의미함. Class C 전역변수 v가 호출됨.
        System.out.println(this.v);
    }
}

public class ScopeThis {

    public static void main(String[] args) {
        C c1 = new C();
        c1.m();
    }

}