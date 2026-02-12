public class Fibonacci{
    static void  Fibonacci_numbers(int n){
        int first=0;
        int second=1;
        if(n==0){
            System.out.println(first);
            return;
        }
    else if(n==1){
        System.out.println(second);
        return;
    }
    else{
        for(int i=2;i<=n;i++){
            System.out.println(first);
            int next=first+second;
            first=second;
            second=next;
        }
    }
}
public static void main(String[] args){
    int n=10;
    System.out.println("The first "+n+" Fibonacci numbers are:");
    Fibonacci_numbers(n);
}
}