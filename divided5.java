import java.util.Scanner;
public class divided5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.err.println("ENTER THE NUMBER THAT DIVISIABLE");
        int a=sc.nextInt();
        if(a%5==0){
            System.out.println("THE NUMBER IS DIVISABLE BY 5");
        }
        else{
            System.out.println("NOT DIVIABLE BY 5");
        }
    }
}