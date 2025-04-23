
public class DeleteKthElem {

    public static class Node {

        int data;
        Node next;

        Node(int new_node) {
            this.data = new_node;
            this.next = null;
        }
    }

    static Node deleteKthElement(Node head, int k) {
        if (head == null || k < 0) {
            return head;
        }

        if (k == 1) {
            Node temp = head;
            head = head.next;
            return head;
        }

        int cnt = 0;
        Node temp = head;
        Node prev = null;

        while (temp != null) {
            cnt++;
            if (cnt == k) {
                if (prev != null) {
                    prev.next = temp.next;
                }
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }

    static Node deleteElement(Node head, int el) {
        if (head == null) {
            return head;
        }

        if (head.data == el) {
            Node temp = head;
            head = head.next;
            return head;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null) {
            if (temp.data == el) {
                if (prev != null) {
                    prev.next = temp.next;
                }
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;

    }

    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        System.out.println("Original Linked List:");
        printList(head);

        int k = 2; // 1-based index
        head = deleteKthElement(head, k);

        System.out.println("Linked List after deleting " + k + "th element:");
        printList(head);

        head = deleteElement(head, 8);
        printList(head);
    }
}
