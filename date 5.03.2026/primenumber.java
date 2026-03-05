public class primenumber{
    public static void prime_n(int n){
        System.out.println("All the prime numbers within 1 and "+n+"are");
        for(int i=1;i<=n;i++){
            int flg=1;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    flg = 0;
                    break;
                }
            }
            if(flg==1){
                System.out.print(i+" ");
            }
        }
        }
        public static void main(String[] args){
            int n=45;
            prime_n(n);

        }
    
}