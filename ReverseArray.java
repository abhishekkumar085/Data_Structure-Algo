class ReverseArray{
    public static void printArray(int arr[],int n){
       System.out.println("Reversed Array is :- \n");
       for(int i=0;i<n;i++){
        System.out.print(arr[i] + " ");
       }
    }
    // function to reverse an array using recursion

    public static void ReversedArr(int arr[],int start,int end){
        if(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            ReversedArr(arr,start+1,end-1);


        }
    }
    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 5, 4, 3, 2, 1};
        ReversedArr(arr, 0, n - 1);
        printArray(arr, n);
     }
}