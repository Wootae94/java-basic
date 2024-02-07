package variable;

public class VarType {
    public static void main(String[] args) {
        boolean booleanType = true; //불리언(boolean) true,false
        char charType = 'A'; // 문자 하나
        String stringType = "Hello Java";

        // 정수
        byte byteType = 127; // -128 ~ 127
        short shortType = 32767; // -32768 ~ 32767
        int intType = 2147483647; // -2147483648 ~ 2147483647
        long longType = 9223372036854775807L; // -9223372036854775808 ~ 9223372036854775807

        // 실수
        float floatType = 10.0f;
        double doubleType = 10.5; //실수

        System.out.println(booleanType);
        System.out.println(charType);
        System.out.println(stringType);
        System.out.println(byteType);
        System.out.println(shortType);
        System.out.println(intType);
        System.out.println(longType);
        System.out.println(floatType);
        System.out.println(doubleType);
    }


}
