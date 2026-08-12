import java.util.Scanner;
public class count{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("THE NUMBER");
        int a=sc.nextInt();
        int count=0;
        while(a!=0){
            a=a/10;
            count=count+1;
        }
        System.out.println("THE count OF the NUMBER"+count);
    }
}