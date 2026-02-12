public class primenumber{
    static boolean isprime(int n){
        if(n<=1){
            return false;
        }
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    return false;
                }}
        return true;
            }
       
    public static void main(String[] args) {
        int n_1=29;
        if(isprime(n_1)){
        System.out.println(n_1+" is a prime number");
    }
    else{
        System.out.println(n_1+" is not a prime number");
    }
    }
}
