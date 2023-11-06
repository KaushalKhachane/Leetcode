public class Knapsack01DP {

    static int knapSack(int W, int wt[], int val[], int n){
        int i, w;
        int dp[][] = new int[n+1][W+1];


        //build table for dp[][] in bottom up manner
        for(i = 0; i <= n; i++){
            for(w = 0; w <= W; w++){
                if(i == 0 || w == 0){
                    dp[i][w] = 0;
                }else if(wt[i-1] <= w){
                //    dp[i][w] = Math.max(val[i-1]+dp[i-1][w-wt[i-1]], dp[i-1][w]);
                   dp[i][w]
                        = Math.max(val[i - 1]
                                  + dp[i - 1][w - wt[i - 1]],
                              dp[i - 1][w]);
                }else{
                    dp[i][w] = dp[i-1][w];
                }
            }
        }
        return dp[n][W];
    }
    public static void main(String[] args) {
        int profit[] = new int[] { 2,3,5,7 };
        int weight[] = new int[] { 2,3,4,5 };
        int W = 7;
        int n = profit.length;
        System.out.println(knapSack(W, weight, profit, n));        
    }
}
