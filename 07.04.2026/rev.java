import java.util.Scanner;

public class rev{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int rev = 0;
        for (; num != 0; num /= 10) {
            int digit = num % 10;
            rev = rev * 10 + digit;
        }

        System.out.println("Reversed = " + rev);
    }
}