import java.util.Scanner;
public class  cgpa{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of subjects:");
        int n=sc.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            System.out.println("Enter the marks for subject "+i+":");
            double marks=sc.nextDouble();
             System.out.println("Enter the marks for credit "+i+":");
             double credit=sc.nextDouble();
             sum+=(marks*credit);
       
        }
        System.out.println("CGPA is: "+sum/(n*10));
        
        sc.close();
    }
}