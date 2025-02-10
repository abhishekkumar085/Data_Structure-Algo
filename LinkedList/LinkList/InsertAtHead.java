package LinkedList.LinkList;

class Node {

    int data;
    Node next;

    Node(int new_node) {
        this.data = new_node;
        this.next = null;
    }

}

public class InsertAtHead {

    public static Node insertAtFront(Node head, int new_data) {

        Node new_node = new Node(new_data);
        new_node.next = head;
        return new_node;
    }

    public static Node insertAtEnd(Node head, int new_data) {
        Node new_node = new Node(new_data);
        
        if (head == null) {
            return new_node; 
        }
    
        Node curr = head;
        while (curr.next != null) { 
            curr = curr.next;
        }
    
        curr.next = new_node; // Insert at the end
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
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);
        System.out.println("Original Linked List");
        printList(head);
        System.out.println("After inserting Nodes at the front:");
        int data = 1;
        head = insertAtFront(head, data);

       

        printList(head);

        System.out.println("After inserting a Node at the end:");
        head = insertAtEnd(head, 6);
        printList(head);
    }

}
