public class Downward_Triangle_Star{
    public static void main(String[] args){
        int r=5;
        for(int i=r-1;i>=0;i--){
            for(int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}