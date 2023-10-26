public class EditDistanceDp {

    public static int getDistance(String s1, String s2, int m, int n) {
        int dp[][] = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {  // Corrected loop bounds
            dp[i][0] = i;
        }

        for (int j = 0; j <= n; j++) {  // Corrected loop bounds
            dp[0][j] = j;
        }

        for (int i = 1; i <= m; i++) {  // Corrected loop bounds
            for (int j = 1; j <= n; j++) {  // Corrected loop bounds
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String s1 = "CAuT";
        String s2 = "CUT";
        int m = s1.length();
        int n = s2.length();

        System.out.println(getDistance(s1, s2, m, n));
    }
}
