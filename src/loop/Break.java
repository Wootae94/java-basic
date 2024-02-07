package loop;

public class Break {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) {
            sum = sum + i;
            if (sum > 10000) {
                System.out.println("i가 10보다 크면 종료: i = " + i + " sum = " + sum);
                break;
            }
            i++;
        }

        sum = 0;
        i = 1;

        for (; ; ) {
            sum = sum + i;
            if (sum > 10000) {
                System.out.println("i가 10보다 크면 종료: i = " + i + " sum = " + sum);
                break;
            }
            i++;
        }

        sum = 0;
        for (int j = 1; ; j++) {
            sum = sum + j;
            if (sum > 10000) {
                System.out.println("i가 10보다 크면 종료: j = " + j + " sum = " + sum);
                break;
            }
        }

    }
}
