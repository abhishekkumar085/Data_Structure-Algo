package ArrayProblem;

class DiagonalSum {

    static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j || i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;

    }

    static void print2DArray(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
    }

    static int diagonalSumBetter(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - i - 1) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12},
        {13, 14, 15, 16}};
        // System.out.println(diagonalSum(matrix));
        System.out.println(diagonalSumBetter(matrix));
        print2DArray(matrix);

    }
}
