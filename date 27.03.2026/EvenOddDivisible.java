public class EvenOddDivisible {
    public static void main(String[] args) {
        int num = 20;

        if (num % 2 == 0) {
            if (num % 5 == 0) {
                System.out.println("Even and divisible by 5");
            } else {
                System.out.println("Even but not divisible by 5");
            }
        } else {
            if (num % 5 == 0) {
                System.out.println("Odd and divisible by 5");
            } else {
                System.out.println("Odd and not divisible by 5");
            }
        }
    }
}nn