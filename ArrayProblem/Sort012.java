package ArrayProblem;

import java.util.*;

class Sort012 {

    public static void sort012(ArrayList<Integer> arr) {
        int n = arr.size();
        int cnt0 = 0, cnt1 = 0, cnt2 = 0;

        for (int i = 0; i < n; i++) {
            if (arr.get(i) == 0) {
                cnt0++; 
            }else if (arr.get(i) == 1) {
                cnt1++; 
            }else {
                cnt2++;
            }
        }

        for (int i = 0; i < cnt0; i++) {
            arr.set(i, 0);
        }
        for (int i = 0; i < cnt1; i++) {
            arr.set(i, 1);
        }
        for (int i = 0; i < cnt2; i++) {
            arr.set(i, 2);
        }
    }
}
