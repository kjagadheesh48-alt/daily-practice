import java.util.Scanner;
public  class smallest2{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the 2 number");
        int b = sc.nextInt();
        if(a<b){
            System.out.println("1 the smallest  number"+a);
        }
        else{
            System.out.println("2 the smallest  number"+b);
        }

    }
}
