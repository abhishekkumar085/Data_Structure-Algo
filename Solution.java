

// for best case Tc will be Ω(n)
// for the worst case Tc will be O(n^2)


import java.util.*;
import java.io.*;

public class Solution {

    public static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < n - i - 1; j++) { 
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break; // Use break instead of return for better control in the loop
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,6,2};
        int n = arr.length;
        bubbleSort(arr, n);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
