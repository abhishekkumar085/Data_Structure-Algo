package ArrayProblem;

class MoveZeroAtEnd {

    static void moveZeroAtEnd(int arr[]) {
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        System.out.println("Index: " + index);
        System.out.println("Length: " + arr.length);
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
        moveZeroAtEnd(arr);
        printArray(arr);
    }
}