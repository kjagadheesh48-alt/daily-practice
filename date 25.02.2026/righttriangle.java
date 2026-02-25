import java.util.Scanner;
public class righttriangle{
    public static void righttriangle(int n){
            for(int i=1;i<=n;i++){
                
                for(int j=1;j<=i;j++){
                        System.out.print("*");
                } 
             System.out.println();              
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ROWS TO BE BUILD");
        int n = sc.nextInt();
        righttriangle(n);
    }
}