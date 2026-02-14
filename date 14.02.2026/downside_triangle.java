import java.util.Scanner;
public class downside_triangle{
    static int downside(int n){
         for (int i = n; i >= 1; i--) {

           
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        return 1;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n=sc.nextInt();
        int result=downside(n);
       if(result==1){
        System.out.println("Triangle printed successfully.");
    }
    else{
        System.out.println("Failed to print the triangle.");
    }
}}