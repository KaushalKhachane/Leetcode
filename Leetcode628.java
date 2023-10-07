class Solution {
    public static int[] reverseArray(int[]arr, int start, int end) {
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;
    }
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        if(n < 3){
            return 0;
        }

        Arrays.sort(nums);
        reverseArray(nums, 0, n-1);
        int result = 1;
        for(int i = 0; i < 3; i++){
            result *= nums[i];
        }

        return result;
    }
}