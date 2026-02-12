public class palindrome{
    static int reversenumber(int n){
        int rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n=n/10;

        }
        return rev;
    }
        public static void main(String[] args){
            int n_1=121;
            int revs=reversenumber(n_1);
            System.out.println("reverse of n="+revs);
            if (n_1==revs){
                System.out.println("palindrome number");
            }
            else{
                System.out.println("not a palindrome number");
            }
        }

    }
    
