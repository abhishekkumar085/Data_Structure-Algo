package ArrayProblem;

public class PrifixSum {

    public static void prefixSum(int arr[]) {

        int n = arr.length;
        int totalCount = 0;

        int maxSum = Integer.MIN_VALUE;

        int prefix[] = new int[n];

        prefix[0] = arr[0];
        // calculate prefix sum
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                // for(int k=i;k<=j;k++){
                //     sum+=arr[k];
                //     System.out.print("{"+arr[k]+"}");
                // }
                // using prefix sum to reduce the time complexity O(n^2)
                sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                System.err.println(" Sum is : " + sum);
                if (sum > maxSum) {
                    maxSum = sum;
                }
                totalCount += 1;
                System.out.println();
            }
        }
        System.out.println("Total Count of the pair of an arr is : " + "" + totalCount);
        System.out.println("Max Sum is : " + maxSum);
    }

    public static void main(String[] args) {
        // int arr[] = {2, 4, 6, 8, 10};
        // int arr[] = {1, -2, 6, -1, 3};
        int arr1[] = {-1, -2, -3, -4};
        // prefixSum(arr);
        prefixSum(arr1);
    }

}
