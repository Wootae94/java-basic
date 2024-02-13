package array;

public class Array {
    public static void main(String[] args) {
        //int[] students;
        //students = new int[5];
        //students[0] = 90;
        //students[1] = 80;
        //students[2] = 70;
        //students[3] = 60;
        //students[4] = 50;

        //int[] students = new int[]{90,80,70,60,50};

        int[] students = {90, 80, 70, 60, 50};
        for (int i = 0; i < students.length; i++) {
            System.out.println("student" + (i + 1) + " = " + students[i]);
        }

    }
}
