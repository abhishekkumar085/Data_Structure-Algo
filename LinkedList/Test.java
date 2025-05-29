package LinkedList;

public class Test {

    int num;

    Test(int num) {
        this.num = num;
        System.out.println("Test class constructor called with value: " + num);
    }

    void display() {
        System.out.println("Display method called in Test class.");
        System.out.println("Value of num: " + num);
    }

    public static void main(String[] args) {
        Test test = new Test(10);
        test.display();
    }
}
