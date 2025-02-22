package ArrayProblem;

import java.util.Arrays;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // step 1: find the first decreasing element from the end/right
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) { // if there is valid pivot
            int j = n - 1;

            // step 2: find the element just greater than pivot element to swap
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }

            // step 3: swap the pivot element with the element just greater than pivot element
            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);
    }

    // Helper function to swap two elements
    private static void swap(int nums[], int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Helper function to reverse the array from start to end
    private static void reverse(int nums[], int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));  // Output: [1, 3, 2]
    }
}
