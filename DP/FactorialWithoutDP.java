import java.math.BigInteger;

public class FactorialWithoutDP {
    public static BigInteger factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }

        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 500;
        BigInteger result = factorial(n);
        System.out.println("Factorial(" + n + ") has " + result.toString().length() + " digits.");
        // To print the actual result, you can use result.toString()
        // System.out.println("Factorial(" + n + ") = " + result.toString());
    }
}
