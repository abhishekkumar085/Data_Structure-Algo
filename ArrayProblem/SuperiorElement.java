package ArrayProblem;

import java.util.*;

public class SuperiorElement {
    public static ArrayList<Integer> superiorElement(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean leader = true;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] <= nums[j]) {
                    leader = false;
                    break;
                }
            }
            if (leader) {
                result.add(nums[i]);
            }
        }

        return result;

    }

    public static ArrayList<Integer> superiorElementOtimized(int nums[]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int max = nums[n - 1];
        ans.add(max);
        System.out.println(max);
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > max) {
                ans.add(nums[i]);
                max = nums[i];
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 2 };
        // System.out.println(superiorElement(nums));
        System.out.println(superiorElementOtimized(nums));
    }
}