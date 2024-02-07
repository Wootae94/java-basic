package casting;

public class Casting {
    // 작은 범위에서 큰 범위로의 대입은 허용된다.

    public static void main(String[] args) {

        int intValue = 10;
        long longValue;
        double doubleValue;
        // 자동 형변환(묵시적 형변환)
        longValue = intValue; // int -> long
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; // int -> double
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; // long -> double
        System.out.println("doubleValue3 = " + doubleValue);

        //명시적 형변환
        // 직접 형변환. 손실될 수 있는 위험을 직접 감수하고도 형변환을 원할때, 사용.
        doubleValue = 1.5;
        // intValue = doubleValue; 컴파일 오류 발생
        intValue = (int) doubleValue;  // double -> int : 소수점 손실
        System.out.println("형변환 이전 : doubleValue = " + doubleValue);
        System.out.println("형변환 이후 : intValue = " + intValue);

        long maxIntValue = 2147483647L; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1 (초과)

        intValue = (int) maxIntValue; // long -> int : int 범위 넘어서지 않을때, 문제없음
        System.out.println("maxIntValue casting : intValue = " + intValue);

        intValue = (int) maxIntOver; // long -> int : int 범위 넘어설때, 오버플로우 발생. 제일 작은 int값부터 넘어선만큼 다시 시작
        System.out.println("maxIntOver casting : intValue = " + intValue);

    }
}
