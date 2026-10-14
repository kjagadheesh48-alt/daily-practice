import java.util.Scanner;
class demo{
    public static void main(String args[]){
        int [] score=new int[5];
        Scanner scan = new Scanner(System.in);
        int n=4;
        for(int i=0;i<=n;i++){
            score[i]=scan.nextInt();  
        } 
        System.out.println(score[0]+score[1]+score[2]+score[3]+score[4]);
    }
}