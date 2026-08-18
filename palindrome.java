import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("palindrome number");
        int a=sc.nextInt();
        int rev=0;
        int b=a;
        while(a!=0){
            int di=a%10;
            rev=(rev*10)+di;
            a=a/10;


        }
        if(rev==b){
            System.out.println("THE ENTERED NUMBER IS palindrome"+b);
        }
        else{

        }
        System.out.println("THE ENTERED NUMBER IS NOT palindrome"+b);
    }
}