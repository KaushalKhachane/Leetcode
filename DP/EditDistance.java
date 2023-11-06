public class EditDistance {
    public static int getDistance(String s1, String s2, int m, int n) {
        // base
        if(m == 0){
            return n;
        }
        if(n == 0){
            return m;
        }
        // recursion
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return getDistance(s1, s2, m-1, n-1);
        }else{
            return 1 + Math.min(getDistance(s1, s2, m, n-1),
            Math.min(getDistance(s1, s2, m-1, n),
            getDistance(s1, s2, m-1, n-1)));
        }
    }
    public static void main(String[] args) {
        String s1 = "CAuT";
        String s2 = "CUT";
        int m = s1.length();
        int n = s2.length();

        System.out.println(getDistance(s1, s2, m, n));
    }
}
