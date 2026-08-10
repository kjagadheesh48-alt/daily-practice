import java.util.Scanner;

public class which{
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);  
     System.out.print("eneter the number to check");
     int a=sc.nextInt();
     if(a<0){
            System.out.println("NEGTIVE");
            
     }
     if(a==0){
        System.out.println("ZERO");
     }
     if(a>0){
        System.out.println("POSTIVE");
     }
     
    }
}