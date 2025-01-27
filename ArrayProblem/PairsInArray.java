package ArrayProblem;

public class PairsInArray {

    public static void pairsArr(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.err.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();

        }

    }

    public static int countPairs(int arr[]) {
        int n = arr.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                count += 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        pairsArr(arr);
        System.out.println("Total Count of the pair of an arr is : " + ""+ countPairs(arr));
    }

}
