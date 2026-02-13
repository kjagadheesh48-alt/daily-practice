import java.util.Scanner;
public class multiplication_table{
    static void multiplication(){
        int b;
        Scanner v=new Scanner(System.in);
        System.out.println("Enter the number to be multiplied:");
        int a= v.nextInt();
        System.out.println("The multiplication is:");
        
        for(b=1;b<=10;b++){
            int result=a*b;
            System.out.println(a+"*"+b+"="+result);

        }
    }
    public static void main(String[] args){
        multiplication();
        
    }}