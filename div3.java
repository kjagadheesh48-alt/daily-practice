import java.util.Scanner;
public class div3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.err.println("ENTER THE NUMBER THAT DIVISIABLE");
        int a=sc.nextInt();
        if((a%7==0)&&(a%3==0)){
            System.out.println("THE NUMBER IS DIVISABLE BY 7 and 3");
        }
        else{
            System.out.println("NOT DIVIABLE BY 7 and 3");
        }
    }
}