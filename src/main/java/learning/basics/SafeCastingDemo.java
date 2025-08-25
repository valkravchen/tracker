package learning.basics;

public class SafeCastingDemo {
    public static void main(String[] args) {
        long bigNumber = 2000000000L * 2;
        if (bigNumber <= Integer.MAX_VALUE && bigNumber >= Integer.MIN_VALUE) {
            int number = (int) bigNumber;
            System.out.println(number);
        } else {
            System.out.println("Число большое для int!");
        }
    }
}
