import java.util.Scanner;
public class triangle{
    public static int triangle(int n){
       
        for(int i=0;i<=n;i++){
            
            for(int j=0;j<=n-i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER THE NUMBER OF ROWS");
        int n=sc.nextInt();
        int a=triangle(n);
        if(a==1){
            System.out.println("STAR HAVE BEEN PRINTED");
        }
        else{
             System.out.println("STAR HAVE NOT BEEN PRINTED");
        }
    }
}