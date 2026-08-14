
import java.util.Scanner;

public class smallest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number");
        float a=sc.nextFloat();
        System.out.print("Enter the2 number");
        float b=sc.nextFloat();
        System.out.print("Enter the3 number");
        float c=sc.nextFloat();
        if((a<b)&&(a<c)){
             System.out.println("first number id the smallest"+a);
            
        }
        else if ((b<a)&&(b<c)) {
               System.out.println("the smallest  number is"+b);

    }
    else{
        System.out.println("the smallest  number is"+c);

    }}

}