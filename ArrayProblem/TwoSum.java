package ArrayProblem;

class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    // another approach pair sum
    static int[] pairSum(int[] nums, int target) {
        int[] result = new int[2];
        int left = 0;
        int right = nums.length - 1;
        int pairSums = nums[left] + nums[right];
        while (left < right) {
            if (pairSums == target) {
                result[0] = left;
                result[1] = right;
                return result;
            } else if (pairSums < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        int[] result1 = pairSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
        System.out.println(result1[0] + " " + result1[1]);
    }
}
