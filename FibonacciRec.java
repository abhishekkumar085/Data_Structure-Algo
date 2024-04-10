public class FibonacciRec {
    public static int fib(int n) {
        if (n == 0 || n == 1)
            return n;

        int ans = fib(n - 1) + fib(n - 2);
        return ans;

    }

    public static void main(String[] args) {
        int result = fib(2);
        System.out.println(result);
    }
}
// space complexity O(n)
// Time Complexity O(2^n)