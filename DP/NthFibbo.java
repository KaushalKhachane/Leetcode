public class NthFibbo {
    public static long fibonacci(int n) {
        if (n <= 0) {
            return 0;
        }

        // Create an array to store the Fibonacci numbers
        long[] fibArray = new long[n + 1];

        // Initialize the first two Fibonacci numbers
        fibArray[0] = 0;
        fibArray[1] = 1;

        // Calculate the Fibonacci numbers from 2 to n
        for (int i = 2; i <= n; i++) {
            fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
        }

        // The nth Fibonacci number is stored in fibArray[n]
        return fibArray[n];
    }

    public static void main(String[] args) {
        int n = 10; // Change this to the desired value of n
        long result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
}
