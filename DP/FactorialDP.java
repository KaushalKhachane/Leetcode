public class FactorialDP {
    public static long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }

        long[] dp = new long[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i - 1] * i;
        }

        return dp[n];
    }

    public static void main(String[] args) {
        int n = 500; // Change this to the desired number for which you want to calculate factorial
        long result = factorial(n);
        System.out.println("Factorial(" + n + ") = " + result);
    }
}
