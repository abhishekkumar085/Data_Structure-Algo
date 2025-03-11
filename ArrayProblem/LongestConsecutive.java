package ArrayProblem;

import java.util.Arrays;

class LongestConsecutive {

    static int longestConsecutive(int arr[]) {
        int n = arr.length;
        int temp = 1;
        int max = 1;

        Arrays.sort(arr);

        System.out.println("SORTED ARRAYS " + Arrays.toString(arr));
        if (arr.length == 0)
            return 0;

        for (int i = 1; i < n; i++) {
            // if (arr[i] == arr[i - 1])
            // continue;

            if (arr[i] - arr[i - 1] == 1) {
                temp++;
                max = Math.max(max, temp);
            } else {
                temp = 1;
            }
        }

        return max;

    }

    public static void main(String[] args) {
        System.out.println("Hii there!!");
        int arr[] = { 15, 6, 2, 1, 16, 4, 2, 29, 9, 12, 8, 5, 14, 21, 8, 12, 17, 16, 6, 26, 3
        };
        System.out.println(longestConsecutive(arr));
    }
}