// Tabulation

public class LongestCommSubString {
    static int lcs(String s1, String s2) {
        int m = s1.length();  
        int n = s2.length();
        
        int dp[][] = new int[m+1][n+1];

        // first column as zero
        for(int i = 0; i <= m; i++){
            dp[i][0] = 0;
        }

        // first row as zero
        for(int j = 0; j <= n; j++){
            dp[0][j] = 0;
        }

        // filled remaining values
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        return dp[m][n];

    }
    public static void main(String[] args) {
        String X = "AGGTAB";
        String Y = "GXTXAYB";
        
        System.out.println("Length of LCS is: " + lcs(X, Y));
    }
}
