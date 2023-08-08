import java.util.Arrays;

// find the prime number till given numbers

public class Sieve {

    public static void printPrimes(int num) {

        // declare boolean type array and marks all the element true at first time
        boolean[] prime = new boolean[num + 1];
        Arrays.fill(prime, true);

        for (int i = 2; i * i <= num; i++) {
            // check if the number
            if (prime[i]) {
                // mark all the multiple of the prime no. to false like non prime number became
                // false now
                for (int j = 2 * i; j <= num; j = j + i) {
                    prime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (prime[i]) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("count: " + count);
    }

    public static void main(String[] args) {
        printPrimes(10);

    }
}
