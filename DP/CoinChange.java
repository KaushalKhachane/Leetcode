public class CoinChange {
    static int getCount(int coins[], int n, int sum) {
        if (sum == 0) {
            return 1; 
        }
        if (n == 0) {
            return 0;
        }

        int withoutLastCoin = getCount(coins, n - 1, sum);

        int withLastCoin = 0;
        if (coins[n - 1] <= sum) {
            withLastCoin = getCount(coins, n, sum - coins[n - 1]);
        }

        return withoutLastCoin + withLastCoin;
    }

    public static void main(String[] args) {
        int coins[] = {5, 10, 15};
        int targetSum = 15;
        System.out.println(getCount(coins, coins.length, targetSum));
    }
}
