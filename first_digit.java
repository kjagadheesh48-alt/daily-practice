import java.util.Scanner;
public class first_digit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("THE REVERSER OF the NUMBER");
        int a=sc.nextInt();
        int rev=0;
        while (a!=0){
            int dig=a%10;
            rev=a;
            a=a/10;
            


        }
        System.out.println("THE REVERSER OF the NUMBER"+rev);
    }
}