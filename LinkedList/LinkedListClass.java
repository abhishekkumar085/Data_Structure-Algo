package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

public class LinkedListClass {

    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;

        }
        return head;
    }

    private static void traverseLinkedList(Node head) {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");

            temp = temp.next;
        }

    }

    private static int printLengthOftheLL(Node head) {
        int cnt = 0;

        Node temp = head;

        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        return cnt;
    }

    private static boolean searchInLinkedList(Node head, int val) {

        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    private static int[] twoSum(int arr[], int target) {
        int n = arr.length;

        int j = n - 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] + arr[j] == target) {
                return new int[] { i, j };
            }

        }

        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        System.out.println("Hii Linked List");

        int[] arr = { 12, 5, 6, 8, 5, 4 };
        Node y = new Node(arr[2]);

        Node head = convertArr2LL(arr);
        // System.out.println(head.data);
        // System.out.println(y.next);
        // System.out.println(printLengthOftheLL(head));

        // traverseLinkedList(head);

        System.out.println(searchInLinkedList(head, 51));

        int[] arr1 = { 2, 7, 9, 11 };
        int target = 13;

        int[] result = twoSum(arr1, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);

    }

}
