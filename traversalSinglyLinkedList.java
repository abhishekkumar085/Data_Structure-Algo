
public class traversalSinglyLinkedList {
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // function to traverse and print the elements of the linked list
    void traverseLinkedList(Node head) {
        // start from the head of the linked list
        Node current =head;


        // traverse until reaching the tail(null)
        while (current!=null) {
            System.out.println(current.data+ " ");

            // move to the next
            current=current.next;
            
        }

        System.out.println("");
    }

}