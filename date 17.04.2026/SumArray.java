public class SumArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        int sum = 0, i = 0;

        while(i<arr.length){
            sum += arr[i];
            i++;
        }
        System.out.println(sum);
    }
}