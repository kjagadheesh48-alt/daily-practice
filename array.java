import java.util.Scanner;
class array{
    public static void main(String args[]){
        int n= 5;
        int [] array= new int[n];
        
         Scanner scan = new Scanner(System.in);
         for(int i=0;i<n;i++){
            System.out.println("ENETR THE ELEMENT IN THE STACK"+(i+1));
            array[i]=scan.nextInt();
         }
         int arrayLength = array.length; 
         System.err.println("THE LENGTH OF THE STACK"+arrayLength);
         for (int j=arrayLength;j>=1;j--){
            int a =j-1;
            System.out.println("THE STACK NUMBER"+array[a]);
            
            }
         }


    }
