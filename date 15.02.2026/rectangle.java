import java.util.Scanner;
public class rectangle{
    static int rectangle(int n, int m) {
        for(int a=1; a<=n;a++){
            for(int b=1;b<=m;b++){
                if(a==1||a==n||b==1||b==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
        return 1;

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of the rectangle:");
    int n = sc.nextInt();
    System.out.println("Enter the breadth of the rectangle:");
    int m = sc.nextInt();
    int result=rectangle(n,m);
    if (result==1){
        System.out.println("The rectangle is printed successfully.");
    }
    else{
        System.out.println("There was an error printing the rectangle.");
    }
}
}