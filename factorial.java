
public class factorial {
    public static int f(int n) {
        if (n == 1)
            return 1;

        int ans = n * f(n - 1);
        return ans;
    }

    public static void main(String[] args) {
        int result = f(4);
        System.out.println(result);
    }
}
// time complexity O(n)
// Space Complexity O(1)