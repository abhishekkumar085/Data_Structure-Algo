package DynamicProgramming;


import java.util.*;


public class Fibonaccidp {
    public static int dp[];

    public static int f(int n) {
        if (n == 0 || n == 1)
            return n;

        if (dp[n] != -1)
            return dp[n];

        return dp[n] = f(n - 1) + f(n - 2);
    }

    public static int fib(int n) {
        dp = new int[1000005];
        Arrays.fill(dp, -1);

        return f(n);

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }

}