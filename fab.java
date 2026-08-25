import java.util.*;
public class fab{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the sum of number");
    int d=sc.nextInt();
    int a=0;
    int b=1;
    for (int i = 0; i <=d; i++) {
        System.out.println(a+" ");
        int n=a+b;
        a=b;
        b=n;
    }

    }}