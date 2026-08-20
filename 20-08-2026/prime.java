
import java.util.Scanner;
public class prime{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("THE the NUMBER");
        int a=sc.nextInt();
        int c=0;
        for(int i=2;i<=(a-1);i++){
            
            if(a%i==0){
                c=1;
                break;
                
            }
        
        }
        if(c==1){
            System.out.println("NOT PRIME");
            
        }
        else{
            System.out.println(" PRIME");
        }

        }

        
    }