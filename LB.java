public class LB {
    
    public static int l_b(int[] arr, int n, int k) {
        int lo = 0;
        int hi = n - 1;
        int ans = -1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            System.out.println(mid);
            if (arr[mid] >= k) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        // int[] arr = {2,4,6,8,8,8,11,13};
        int[] arr = {0,1,1,5};
        int n = arr.length;
        int k = 1;

        System.out.println(l_b(arr, n, k));  // Corrected method call
    }
}