public class Main {
    public static void main(String[] args) {
        int n = 10;
        int a = 0, b = 1;

        int i = 1;

        while (i <= n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            i++;
        }
    }
}