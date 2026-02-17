public class PascalTriangle {

    static int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {

            for (int space = 0; space < n - i; space++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                int value = factorial(i) / (factorial(j) * factorial(i - j));
                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}
