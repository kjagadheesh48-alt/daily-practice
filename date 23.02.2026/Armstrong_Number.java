
public class Armstrong_Number {

    static void Armstrong_Number(int l, int h) {
        for (int j = l + 1; j < h; j++) {

            int y = j;
            int n = 0;
            while (y != 0) {
                y /= 10;
                n++;
            }
            int sum = 0;
            y = j;
            while (y != 0) {
                int d = y % 10;
                sum += (int)Math.pow(d, n);  
                y /= 10;
            }
            if (sum == j) {
                System.out.print(j + " ");
            }
        }
    }
    public static void main(String args[]) {
        int n1 = 50;
        int n2 = 500;
        Armstrong_Number(n1, n2);
        System.out.println();
    }
}
