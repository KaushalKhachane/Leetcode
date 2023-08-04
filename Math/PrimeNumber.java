public class PrimeNumber {

    // naive solution
    public static boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    // checked until sqrt(n)
    public static boolean isPrimeNum(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i < n; i++) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(13));
        System.out.println(isPrimeNum(13));
        System.out.println(isPrimeNum(14));

    }
}
