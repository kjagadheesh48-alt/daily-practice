class factorial {

    static int factorial(int n) {
        int res = 1;
        int i;

        for (i = 2; i <= n; i++) {
            res *= i;
        }

        return res; // ✅ return AFTER the loop
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }
}
