import java.util.Scanner;

public class larg{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b)
            System.out.println("A is larger");
        else
            System.out.println("B is larger");
    }
}