class Solution {
    public String reverseWords(String s) {
        String result = new String();
        int n = s.length();
        int i = 0;

        while(i < n){
            while(i < n && s.charAt(i) == ' '){
                i++;
            }
            if(i >= n) break;
            int j = i + 1;
            while(j < n &&  s.charAt(j) != ' '){
                j++;
            }
            String sub = s.substring(i,j);
            if(result.length() == 0){
                result = sub;
            }else{
                result = sub + " " + result;
            }
            i = j + 1;
        }
        return result;
    }

    // if (s == null || s.length() == 0) {
    //         return s;
    //     }
        
    //     char[] charArray = s.toCharArray();
    //     int n = charArray.length;
        
    //     int start = 0;
    //     int end = 0;
        
    //     while (start < n) {
    //         while (start < n && charArray[start] == ' ') {
    //             start++;
    //         }
            
    //         end = start;
    //         while (end < n && charArray[end] != ' ') {
    //             end++;
    //         }
            
    //         reverseString(charArray, start, end - 1);
            
    //         start = end;
    //     }
        
    //     return new String(charArray);
    // }
    
    // private void reverseString(char[] s, int left, int right) {
    //     while (left < right) {
    //         char temp = s[left];
    //         s[left] = s[right];
    //         s[right] = temp;
    //         left++;
    //         right--;
    //     }
    // }
}