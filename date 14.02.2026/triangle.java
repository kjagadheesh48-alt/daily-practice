import java.util.Scanner;
public class triangle{
    static int triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    
    return 1;
    }

public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int n=sc.nextInt();
    int result=triangle(n);
    if(result==1){
        System.out.println("Triangle printed successfully.");
    }
    else{
        System.out.println("Failed to print the triangle.");
    }
}}
