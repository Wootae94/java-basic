package array;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        // 향상된 for문, for-each문
        for(int number:numbers){
            System.out.println("number = " + number);
        }

        // for-each문을 사용할 수 없는 경우 > 증가하는 index 값이 필요한 경우
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(i +"번째 numbers = " + numbers[i]);
        }
    }
}
