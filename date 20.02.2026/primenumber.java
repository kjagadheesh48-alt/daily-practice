import java.util.Scanner;;
public class primenumber{
    static void prime(int n){
        int x,y,flg=0;
        System.out.println("prime numbers are:");
        for(x=2;x<=n;x++){
            if(x==1||x==0){
                continue;
            }
            flg=1;
            for(y=2;y<=x/2;y++){
                if(x%y==0){
                    flg=0;
                    break;
                }
            }
            if(flg==1){
                System.out.println(x);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prime(n);
    }}
    