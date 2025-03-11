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

    public static void main(String[] args) {
        System.out.println("Hii Linked List");

        int[] arr = { 12, 5, 6, 8 };
        Node y = new Node(arr[2]);

        Node head = convertArr2LL(arr);
        // System.out.println(head.data);
        // System.out.println(y.next);

        traverseLinkedList(head);
    }

}
