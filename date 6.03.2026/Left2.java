public class Left2{

    static void left_2(int stars, int total) {
        if (total == 0) {
            return;
        }

        if (total <= stars) {
            System.out.print("* ");
        } else {
            System.out.print("  ");
        }

        left_2(stars, total - 1);
    }

    static void newrow(int n, int total) {
        if (n == 0) {
            return;
        }

        newrow(n - 1, total);
        left_2(n, total);
        System.out.println();
    }

    public static void main(String[] args) {
        int size = 5;
        newrow(size, size);
    }
}