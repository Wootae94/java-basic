package loop;

public class While {
    public static void main(String[] args) {
        int count = 0;

        while (count < 3) {
            count++;
            System.out.println("count = " + count);
        }

        int sum = 0;
        int i = 1;
        int endNum = 10;
        while (i <= endNum) {
            sum += i;
            System.out.println("i = " + i +" sum = " + sum);
            i++;
        }
    }
}
