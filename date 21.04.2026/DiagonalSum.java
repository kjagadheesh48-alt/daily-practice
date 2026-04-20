public class DiagonalSum {
    public static void main(String[] args) {
        int a[][] = {{1,2},{3,4}};
        int sum = 0;

        for(int i=0;i<2;i++){
            sum += a[i][i];
        }

        System.out.println("Sum = " + sum);
    }
}