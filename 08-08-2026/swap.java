import java.util.Scanner;
public class swap{
    public static void main(String[] args){
        Scanner pc=new Scanner(System.in);
        System.out.println("The swap number");
         int a= pc.nextInt();
        System.out.println("THE next number");
        int b= pc.nextInt();
        int c=a;
        a=b;
        System.out.println("The swap"+a+"the next number"+c);
        
    }
}