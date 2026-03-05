public class prime {
    void findPrimes(int n) {
        boolean[] prime = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            prime[i] = true;
        }
        prime[0] = false;
        prime[1] = false;
        for (int p = 2; p * p <= n; p++) {
            if (prime[p]) {
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }}
        
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                System.out.print(i + " ");
            }
        } }

    public static void main(String[] args) {
        int n = 45;
        System.out.println("All the Prime numbers within 1 and " + n + " are:");

        prime obj = new prime();
        obj.findPrimes(n);
    }
}