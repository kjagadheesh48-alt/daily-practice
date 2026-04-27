import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), temp = num, sum = 0;

        while (num > 0) {
            int r = num % 10;
            int fact = 1;

            for (int i = 1; i <= r; i++) {
                fact *= i;
            }

            sum += fact;
            num /= 10;
        }

        if (sum == temp)
            System.out.println("Strong Number");
        else
            System.out.println("Not Strong");
    }
}