public class LongestCommonSubDP {

    public static int longestCommonSubstring(String s1, String s2, int m, int n, int memo[][]) {

        if (m == 0 || n == 0) {
            return memo[m][n] = 0;
        }
        if (memo[m][n] != -1) {
            return memo[m][n];
        }
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            memo[m][n] = 1 + longestCommonSubstring(s1, s2, m - 1, n - 1, memo);
            return memo[m][n];
        }
        memo[m][n] = Math.max(longestCommonSubstring(s1, s2, m, n - 1, memo),
                longestCommonSubstring(s1, s2, m - 1, n, memo));
        return memo[m][n];

    }

    public static void main(String[] args) {
        String X = "AGGTAB";
        String Y = "GXTXAYB";

        int m = X.length();
        int n = Y.length();

        int memo[][] = new int[m + 1][n + 1];

        // Fill the 2D array with -1
        for (int i = 0; i < m + 1; i++) {
            for (int j = 0; j < n + 1; j++) {
                memo[i][j] = -1;
            }
        }
        System.out.println("Length of LCS is: " + longestCommonSubstring(X, Y, m, n, memo));
    }
}
