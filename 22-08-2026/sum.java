import java.util.*;
public class sum{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the sum of number");
    int a=sc.nextInt();
    int sum=0;
    for(int i=0;a>=i;i++){
        sum=sum+i;
        
    }
    System.out.println("THE SUM OF N NUMBER"+sum);
    }
}