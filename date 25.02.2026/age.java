import java.util.Scanner;
public class age{
public static void age(int a){
    if (a<=15){
        System.out.println("Teenage");
    }
    else if(a<15 && a>=25){
        System.out.println(" adult");
    }
    else if(a<25 && a>60){
        System.out.println("young");
    }
    else if(a<=60){
        System.out.println("senior_citizen");

    }

}
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("The age");
    int a=sc.nextInt();
    age( a);
}
}
