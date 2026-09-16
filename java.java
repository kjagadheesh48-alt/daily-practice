import java.util.*;
public class java{
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    int d=n;
    int t=0;
    int c=0;
    for (int i = 0;i<=n; i++) {
        t=n%10;
        n=n/10;
        c++;
        
    }
        System.out.println("count"+c);
    int a =d%10;
    System.out.println(a);
    if ((a%2==0)&&(t%2==1)){
        System.out.println(t);
        for(int f=1;f<c;f++){
            a=a*10;

        }
        System.out.println(a);

    }



        
            
        }
    
    }
    
