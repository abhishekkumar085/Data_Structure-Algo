package ArrayProblem;

public class MaxSubarrayUsingKadansAlgo {

    public static int SubarraySum(int arr[]) {
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static int SubarraySumHandleNegative(int arr[]) {
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        // Track the maximum element in the array
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            // Update maxElement
            maxElement = Math.max(maxElement, arr[i]);

            // Kadane's Algorithm
            currSum += arr[i];
            if (currSum < 0) {
                currSum = 0;
            }
            maxSum = Math.max(maxSum, currSum);
        }

        // If all elements are negative, return the maximum element
        if (maxElement < 0) {
            return maxElement;
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int arr[] = {-1, -2, -6, -1, -3};
        System.out.println(SubarraySumHandleNegative(arr));
        // System.out.println(SubarraySum(arr));

    }
}

/**
 * Initialize maxSum and currSum 
 * For each element in the array: 
 * Add the element to currSum 
 * If currSum < 0, reset currSum to 0 
 * Update maxSum with the maximum of maxSum and currSum 
 * Return maxSum
 *
 *
 */
