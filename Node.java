
public class Node {

    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int new_node) {
        this.data = new_node;
        this.next = null;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        Node y = new Node(arr[4]);
        System.out.println(y.data);
    }

}
