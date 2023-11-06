public class LongestComminSubString {

    public static int longestCommonSubstring(String s1, String s2, int m, int n) {
        if(m == 0 || n == 0) {
            return 0;
        }
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return 1 + longestCommonSubstring(s1, s2, m-1, n-1);
        }else{
            return Math.max(longestCommonSubstring(s1, s2, m, n-1), longestCommonSubstring(s1, s2, m-1, n));
        }
    }

    public static void main(String[] args) {
        String S1 = "AGGTAB";
        String S2 = "GXTXAYB";
        int m = S1.length();
        int n = S2.length();
        System.out.println(longestCommonSubstring(S1, S2, m, n));
    }
}
  