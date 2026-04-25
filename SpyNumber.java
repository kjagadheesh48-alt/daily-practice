public class SpyNumber {
    public static void main(String[] args) {
        int num = 1124, sum = 0, prod = 1;

        while (num > 0) {
            int r = num % 10;
            sum += r;
            prod *= r;
            num /= 10;
        }

        if (sum == prod)
            System.out.println("Spy Number");
        else
            System.out.println("Not Spy");
    }
}