public class PerfectSquare {
    public static void main(String[] args) {
        int n = 25;
        boolean flag = false;

        for (int i = 1; i <= n; i++) {
            if (i * i == n) {
                flag = true;
                break;
            }
        }

        if (flag)
            System.out.println("Perfect Square");
        else
            System.out.println("Not Perfect Square");
    }
}