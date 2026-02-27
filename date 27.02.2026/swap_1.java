import java.util.Scanner;
public class swap_1{
    public static int swap_1(int a,int b){
        System.out.println("Before swapping:a="+a+",b="+b);
          a=a^b;
          b=a^b;
          a=a^b;
          System.out.println("After swapping:a="+a+",b="+b);   
          return 1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
         System.out.println("The first number");
        int a=sc.nextInt();
        System.out.println("The secound number");
        int b=sc.nextInt();
        int c=swap_1(a,b);
        if(c==1){
            System.out.println("THE SWAP HAVE BEEN DONE");
        }
        
    }
    }
