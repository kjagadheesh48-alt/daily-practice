public class lcm{
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 15;
        int ans=(num1>num2)? num1 : num2;
        while(true){
            if(ans%num1==0 && ans%num2==0){
                break;
            }
            ans++;
        }
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + ans);
    }}