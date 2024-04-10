public class maxValueOftheArrayRecursive {
    public static int f(int arr[],int idx,int n) {
        // base case
        if(idx==n-1){
            return arr[idx];

        };
        return Math.max(arr[idx],f(arr, idx+1, n));

    }
public static void main(String[] args) {
    int arr[]={2,3,45,6,89};
    int n=arr.length;
    System.out.println(f(arr, 0, n));
}
}
