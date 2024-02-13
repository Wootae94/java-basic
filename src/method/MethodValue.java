package method;

public class MethodValue {
    public static void main(String[] args) {

        int number = 5;
        System.out.println("1. changeNumber 호출 전, number = " +  number);
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number = " + number);

        System.out.println();

        System.out.println("5. changeNumber2 호출 전, number = " +  number);
        number  = changeNumber2(number);
        System.out.println("8 changeNumber2 호출 후, number = " + number);
    }

    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number = " + number);
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number = " + number);
    }

    public static int changeNumber2(int number) {
        System.out.println("6. changeNumber2 변경 전, number = " + number);
        number = number * 2;
        System.out.println("7. changeNumber2 변경 후, number = " + number);
        return number;
    }
}
