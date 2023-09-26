import java.util.Arrays;

public class LeftMostRepeatingChar {
    public static final int CHAR = 256;
    public static int leftMost(String str){
        int count[] = new int[CHAR];
        Arrays.fill(count,-1);
        int res = Integer.MAX_VALUE;

        for(int i = 0; i < str.length(); i++){
            int fi = count[str.charAt(i)];
            if(fi == -1){
                count[str.charAt(i)] = i;
            }else{
                res = Math.min(res, fi);
            }
        }
        return(res==Integer.MAX_VALUE) ? Integer.MAX_VALUE : res;
    }
    public static void main(String[] args) {
        System.out.println(leftMost("Kaushal"));
    }
}
