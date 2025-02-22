package ArrayProblem;

class MaximumSubArray {

    static void printSubArray(int arr[]) {
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print("{" + arr[k] + "}");
                    sum += arr[k];

                }
                if (sum > maxSum) {
                    maxSum = sum;
                }
                System.out.println(" Sum is : " + sum);
                System.out.println();
            }
        }
        System.out.println("Max Sum is : " + maxSum);
    }

    static int maxSubArraySumOptimized(int arr[]) { //0(n^2)
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    static long maxSubArraySumOptimal(int arr[]) { //o(n)
        int n = arr.length;
        long maxi = Long.MIN_VALUE; // maximum sum
        long sum = 0;

        for (int i = 0; i < n; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }

            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }

        // To consider the sum of the empty subarray
        // uncomment the following check:
        //if (maxi < 0) maxi = 0;
        return maxi;

    }

    public static void main(String[] args) {
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        printSubArray(arr);
        System.out.println("MaxOtimize Sum is : " + maxSubArraySumOptimized(arr));
        System.out.println("MaxOtimal Sum is : " + maxSubArraySumOptimal(arr));
    }
}
