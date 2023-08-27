class Solution {
    public int findDuplicate(int[] nums) {
        int ans = 0;

        for(int i = 0; i < nums.length; i++){
            ans = ans ^ nums[i];
            System.out.println(ans);
        }

        for(int i = 1; i < nums.length; i++){
            ans = ans ^ i;
        }

        return ans;
    }
}