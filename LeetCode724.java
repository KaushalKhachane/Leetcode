class Solution {
    public int pivotIndex(int[] nums) {
        int tSum = 0;
        int lSum = 0;

        for(int i = 0; i < nums.length; i++){
            tSum = tSum + nums[i];
        }

        for(int i = 0; i < nums.length; i++){

            tSum -= nums[i];
            if(tSum == lSum){
                return i;
            }
            lSum += nums[i];
        }
        return -1;
    }
}