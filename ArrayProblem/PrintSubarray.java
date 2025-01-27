package ArrayProblem;

public class PrintSubarray {
    public static void printSubarr(int arr[]){

        int n=arr.length;
        int totalCount=0;

        int maxSum=0;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    System.out.print("{"+arr[k]+"}");
                }
                System.err.println(" Sum is : "+sum);
                if(sum>maxSum){
                    maxSum=sum;
                }
                totalCount+=1;
                System.out.println();
            }
        }
        System.out.println("Total Count of the pair of an arr is : " + ""+ totalCount);
        System.out.println("Max Sum is : "+maxSum);
    }

    public static void main(String[] args) {
        // int arr[] = {2, 4, 6, 8, 10};
        int arr[] = {1,-2,6,-1,3};
        printSubarr(arr);
    }
    
}
