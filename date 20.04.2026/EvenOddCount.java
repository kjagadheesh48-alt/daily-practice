public class EvenOddCount {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int even = 0, odd = 0;

        for(int x:arr){
            if(x%2==0) even++;
            else odd++;
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}