public class printArrayRec {
    public static void f(int arr[], int idx, int n) {
        if (idx == n)
            return;
        System.out.println(arr[idx]);
        f(arr, idx + 1, n);
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 1, 2, 3, 4, 5 };
        f(arr,0,n);
    
    }
}
