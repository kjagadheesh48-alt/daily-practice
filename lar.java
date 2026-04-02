import java.util.Scanner;

public class lar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int max = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit > max)
                max = digit;
            num /= 10;
        }

        System.out.println("Largest digit = " + max);
    }
}