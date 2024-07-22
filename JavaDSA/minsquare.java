import java.util.*;
public class minsquare {
    public static int minSquare(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i =1;i<=n;i++){
            for(int j = 1;j*j<=i;j++){
                dp[i] = Math.min(dp[i],dp[i-j*j]+1);
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        //minsquare ms = new minsquare();
        int n = 13;
        System.out.println("Minimum numbers of square for "+ n + " is: "+ minSquare(n));
    }
    
}
