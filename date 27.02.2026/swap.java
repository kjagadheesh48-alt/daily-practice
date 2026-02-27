import java.util.Scanner;
public class swap{
    public static int swap(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("THE NUMBER AFTER SWAP a"+a+",b"+b);
        return 1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("The first number");
        int a=sc.nextInt();
        System.out.println("The secound number");
        int b=sc.nextInt();
        int c=swap(a,b);
        if(c==1){
            System.out.println("THE SWAP HAVE BEEN DONE");
        }
        
    }
}