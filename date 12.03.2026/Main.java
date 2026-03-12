
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 3};
        int target = 9;

        Solution s = new Solution();
        int[] result = s.twoSum(nums, target);

        System.out.println(result[0] + " " + result[1]);
    }
}