import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sum = 0;

        for (; num != 0; num /= 10) {
            sum += num % 10;
        }

        System.out.println("Sum = " + sum);
    }
}