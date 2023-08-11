class Solution {
    public int maxSubArray(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int maxSum = nums[0];
        int currentSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];

            // if the current sum is max like after adding positive value to last current
            // sum then this block executed and if current sem less like adding negative
            // value to last current sum this loop won't executed
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }

            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}