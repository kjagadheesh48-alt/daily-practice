import java.util.Scanner;
class reverse {
    public int reverse(int x) {
        
        int ans=0;
        while(x!=0){
            if(ans>Integer.MAX_VALUE/10||ans<Integer.MIN_VALUE/10){
                return 0;
            }
            int rev=x%10;
            ans=(ans*10)+rev;
            x=x/10;
        }
        return ans;
 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("reverse ");
        int x = sc.nextInt();
        reverse r=new reverse();
        int res=r.reverse(x);
        System.out.println("reverse="+res);
        sc.close();
    }
      
  }
