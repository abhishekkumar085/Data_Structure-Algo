import java.util.Arrays;

public class ClimbingStairs {
    public static int dp[];

    public static int f(int n) {
        if (n <= 2)
            return n;
        if (dp[n] != -1)
            return dp[n];
        return dp[n] = f(n - 1) + f(n - 2);
    }

    public int climbStairs(int n) {
        dp = new int[405];
        Arrays.fill(dp, -1);
        return f(n);
    }
}
