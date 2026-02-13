import java.util.Scanner;
public class pyramid{
    static int pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
               System.out.println();
        }
    return 2; }
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int n=s.nextInt();
    int result=pyramid(n);
    if(result==2){
        System.out.println("The pyramid was generated successfully.");
    }
    
} }

