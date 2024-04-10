public class RecArrayTotalSum {

    public static int f(int arr[],int idx,int n){
        if(idx==n-1) {

            return arr[idx];
        }

        return arr[idx]+f(arr, idx+1, n);
        


    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int idx=0;
        System.out.println(f(arr, idx, n));
    }
}