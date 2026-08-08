import java.util.Scanner;
public class reminder {
    public static void main(String[] args){
        Scanner pc=new Scanner(System.in);
        System.out.println("THE DIVIDED");
        float a=pc.nextFloat();
        System.out.println("THE DIVISOR");
        float b=pc.nextFloat();
        float r=a%b;
        System.out.println("THE REMINDER"+r);

    }
}