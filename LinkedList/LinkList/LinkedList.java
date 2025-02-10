class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Insert at the beginning
    void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at the end
    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at a specific position (1-based index)
    void insertAtPosition(int data, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position!");
            return;
        }
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds!");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete from the beginning
    void deleteFromBeginning() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
    }

    // Delete from the end
    void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete from a specific position
    void deleteFromPosition(int pos) {
        if (head == null || pos < 1) {
            System.out.println("Invalid position or empty list!");
            return;
        }
        if (pos == 1) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 1; temp != null && i < pos - 1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            System.out.println("Position out of bounds!");
            return;
        }
        temp.next = temp.next.next;
    }

    // Search for an element in the list
    boolean search(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }
        return false;
    }

    // Reverse the linked list
    void reverse() {
        Node prev = null, current = head, next;
        while (current != null) {
            next = current.next;  // Store next node
            current.next = prev;  // Reverse pointer
            prev = current;
            current = next;
        }
        head = prev;
    }

    // Detect cycle in a linked list using Floyd’s Cycle Detection Algorithm
    boolean detectCycle() {
        Node slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;           // Moves one step
            fast = fast.next.next;      // Moves two steps
            if (slow == fast) return true; // Cycle detected
        }
        return false;
    }

    // Display the linked list
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insertion
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtBeginning(5);
        list.insertAtPosition(15, 3);
        list.printList();  // Output: 5 -> 10 -> 15 -> 20 -> null

        // Deletion
        list.deleteFromBeginning();
        list.printList();  // Output: 10 -> 15 -> 20 -> null

        list.deleteFromEnd();
        list.printList();  // Output: 10 -> 15 -> null

        list.deleteFromPosition(2);
        list.printList();  // Output: 10 -> null

        // Searching
        System.out.println("Search 10: " + list.search(10)); // Output: true
        System.out.println("Search 20: " + list.search(20)); // Output: false

        // Reversal
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.printList();  // Output: 10 -> 30 -> 40 -> null
        list.reverse();
        list.printList();  // Output: 40 -> 30 -> 10 -> null
    }
}
