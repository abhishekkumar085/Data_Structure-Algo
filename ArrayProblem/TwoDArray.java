package ArrayProblem;

public class TwoDArray {

    public static void main(String[] args) {
        // Define a 2D array
        int[][] array = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print the 2D array
        print2DArray(array);
        search(array, 10);
        search(array, 5);
    }

    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    

    public static boolean search(int[][] array, int target) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == target) {
                    System.out.println("found at " + i + " " + j);
                    return true;
                }
            }

        }
        System.out.println("Not found");
        return false;

    }

}
