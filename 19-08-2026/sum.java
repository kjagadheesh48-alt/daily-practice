import java.util.Scanner;
public class sum{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("THE NUMBER");
        int a=sc.nextInt();
        int sum=0;
        while(a!=0){
            int d=a%10;
            sum=sum+d;
            a=a/10;

        }
        System.out.println("THE SUM OF the NUMBER"+sum);
    }
}