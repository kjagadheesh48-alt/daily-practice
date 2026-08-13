import java.util.Scanner;
public class product{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("THE NUMBER");
        int a=sc.nextInt();
        int pro=1;
        while(a!=0){
            int d=a%10;
            pro=pro*d;
            a=a/10;

        }
        System.out.println("THE SUM OF the NUMBER"+pro);
    }
}