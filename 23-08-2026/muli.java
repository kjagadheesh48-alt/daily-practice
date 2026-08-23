import java.util.*;
public class muli{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the multiplication of number");
    int a=sc.nextInt();
    System.out.println("The MULTIPLICATION TABLE"+a);
    for (int i = 1; i <= 10; i++) {
        System.out.println(a+"*"+i+"="+(a*i));
        
    }
    }}