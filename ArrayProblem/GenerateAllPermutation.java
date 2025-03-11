package ArrayProblem;

import java.util.*;

class GenerateAllPermutation {

    public static void permute(int[] nums, int start, List<List<Integer>> result) {

        if (start == nums.length) {
            // convert array to list and add to result

            List<Integer> temp = new ArrayList<>();
            for (int num : nums) {
                temp.add(num);

            }
            result.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            swap(nums, start, i);
            permute(nums, start + 1, result);
            swap(nums, start, i);
        }

    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; // Example input
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, 0, result);
        System.out.println(result);
    }
}
