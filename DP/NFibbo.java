public class NFibbo {

    static int []memo =  {-1, -1, -1, -1, -1, -1};
    public static int fib(int n){
        if(memo[n] == -1){
            int res;
            if(n == 0 || n == 1){
                res = n;
            }else{
                res = fib(n-1)+fib(n-2);
            }
            memo[n] = res;
        }
        return memo[n];
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
