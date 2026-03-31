import java.util.*;
public class Main1{
    public static int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int currentsum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentsum = Math.max(nums[i], currentsum + nums[i]);
            maxsum = Math.max(maxsum, currentsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter elements:");
        int i = 0;
        while (i < n) {
            nums[i] = sc.nextInt();
            i++;
        }
        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);
        sc.close();
    }
}