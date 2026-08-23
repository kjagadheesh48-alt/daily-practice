import java.util.*;
public class sum_odd{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the sum of number");
    int a=sc.nextInt();
    int sum=0;
    for(int i=0;a>=i;i++){
        
        if(i%2==1){
            sum=sum+i;
        }
        
    }
    System.out.println("THE SUM OF N NUMBER odd   :"+sum);
    }
}