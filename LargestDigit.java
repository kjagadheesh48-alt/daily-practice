public class LargestDigit {
    public static void main(String[] args) {
        int num = 53829, max = 0;
        while (num > 0) {
            int r = num % 10;
            if (r > max)
                max = r;
            num /= 10;
        }
        System.out.println("Largest Digit = " + max);
    }}