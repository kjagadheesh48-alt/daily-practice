public class array_2d{
    public static void array_2d(){
       int n=2;
       int m=2;
        int [][] arr=new int[n][m];
        int a=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=a;
                a++;
            }
            
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(arr[i][j]);
                System.out.print(" ");
            }
            System.out.println();

    }
}
public static void main(String[] args){
    array_2d();
}
}