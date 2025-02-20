package ArrayProblem;

class SpiralMatrix {

    static void spiralMatrix(int[][] matrix, int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;

        int totalElements = 0;

        while (totalElements < r * c) {
            // topRow---> leftCol to rightCol
            for (int j = leftCol; j <= rightCol; j++) {
                System.out.print(matrix[topRow][j] + " ");
                totalElements++;
            }
            topRow++;

            // rightCol---> topRow to bottomRow
            for (int i = topRow; i <= bottomRow; i++) {
                System.out.print(matrix[i][rightCol] + " ");
                totalElements++;
            }
            rightCol--;

            // bottomRow---> rightCol to leftCol
            for (int j = rightCol; j >= leftCol; j--) {
                System.out.print(matrix[bottomRow][j] + " ");
                totalElements++;
            }
            bottomRow--;
            // leftCol---> bottomRow to topRow

            for (int i = bottomRow; i >= topRow; i--) {
                System.out.print(matrix[i][leftCol] + " ");
                totalElements++;
            }
            leftCol++;
        }

    }

    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        printMatrix(matrix);
        spiralMatrix(matrix, 4, 4);
    }

}
