public class TralingZeros {

    public static int tralingZeros(int num) {
        int fact = 1;

        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }

        int rev = 0;
        int count = 0;
        while (num != 0) {
            int digit = num % 10;
            rev = (rev * 10) + digit;
            num = num / 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(tralingZeros(5));
    }
}
