package loop;

public class For {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("i = " + i);
        }


        int sum = 0;
        int endNum = 3;
        for (int i = 1; i <= endNum; i++) {
            sum = sum + i;
            System.out.println("i = " + i + " sum = " + sum);
        }
    }
}
