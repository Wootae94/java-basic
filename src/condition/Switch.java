package condition;

public class Switch {
    public static void main(String[] args) {
        int grade = 2;
        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            case 4:
                coupon = 4000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("coupon = " + coupon);

        grade = 3;
        coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };


        System.out.println("coupon = " + coupon);
    }
}
