public class Main {
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
        // Example input
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = maxSubArray(nums);

        System.out.println("Maximum Subarray Sum: " + result);
    }
}