class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int n = s.length();
        int res = 0;

        for(int i = 0; i < n; i++){
            for(int j = i; j < n; i++){
                if(checkRepetition(s,i,j)){
                    res = Math.max(res,j-i-1);
                }
            }
        }
        return res;
    }

    public boolean checkRepetition(String s, int start, int end){
        int []chars = new int[128];

        for(int i = start; i < end; i++){
            char c = s.charAt(i);
            chars[c]++;

            if(chars[i] > 1){
                return true;
            }
        }
        return false;
    }
}