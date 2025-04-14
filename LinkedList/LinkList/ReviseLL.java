
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ReviseLL {

    void traverseLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ==> ");

            temp = temp.next;

        }
        System.out.println("null");

    }

    // Using Recursion
    void traverseLLRecursion(Node head) {

        Node temp = head;
        // Base Case
        if (temp == null) {
            System.out.println();
            return;
        }
        // printing the node
        System.out.print(head.data + " ");

        traverseLLRecursion(head.next);
    }

    // Searching in the LL
    void searchLL(Node head, int element) {
        Node temp = head;
        if (temp == null) {
            System.out.println("head is empty!!");
            return;
        }

        while (temp != null) {
            if (temp.data == element) {
                System.out.println("Element found!!");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Element Not found!!");

    }

    // Insert At Head
    Node frontInsert(Node head, int element) {
        Node temp = new Node(element);
        temp.next = head;
        return temp;
    }

    // Finding Length of the LL
    static int lengthOfLL(Node head) {
        int cnt = 0;

        Node temp = head;

        if (temp == null) {
            return 0;
        }
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }

        return cnt;

    }

    // insertAtEnd
    Node insertNodeAtEnd(Node head, int element) {
        Node new_node = new Node(element);

        if (head == null) {
            return new_node;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = new_node;

        return head;
    }

    // Delete node from the head of th LL;
    public static Node deleteHead(Node head) {
        if (head == null) {
            return null;
        }

        return head.next;
    }

    public static Node deleteTail(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return head;

    }

    // Printing LL
    public static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(" " + curr.data);
            curr = curr.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        ReviseLL obj = new ReviseLL();
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        obj.traverseLL(head);
        obj.traverseLLRecursion(head);

        obj.searchLL(head, 10);

        head = obj.frontInsert(head, 50);
        printList(head);
        lengthOfLL(head);

        System.out.println("the length of the ll " + lengthOfLL(head));

        head = obj.insertNodeAtEnd(head, 60);
        printList(head);

        head = deleteHead(head);

        System.out.println("After deleting head:");
        printList(head);
    }
}
