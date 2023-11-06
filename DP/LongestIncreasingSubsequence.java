class LongestIncreasingSubsequence {
    public static int ceilIndex(int tail[], int l, int r, int x){
        while(r > l){
            int m = l + (r - l)/2;
            
            if(tail[m] >= x){
                r = m;
            }else{
                l = m + 1; 
            }
        }
        return r;
    }
    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;

        int tail[] = new int[n];
        int len = 1;
        tail[0] = nums[0];

        for(int i = 1; i < n; i++){
            if(nums[i] > tail[len-1]){
                tail[len] = nums[i];
                len++;
            }else{
                int idx = ceilIndex(tail, 0, len-1, nums[i]);
                tail[idx] = nums[i];
            }
        }

        return len;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5};
        System.out.println(lengthOfLIS(nums));
    }
}