package SolidPrinciples.LiscovSubstitutionPrinciple;

// Objects of a superclass should be replaceable with objects of its subclasses without affecting the correctness of the program.
//LSP states that a subclass should be able to replace its parent class without breaking the program's behavior.
// LSP ensures that a derived class does not break the behavior expected from its base class.
interface Shape {
    int getArea();
}

class Rectangle implements Shape {

    protected int width;
    protected int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square implements Shape {

    protected int side;

    public Square(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }

}

public class LSP {

    public static void main(String[] args) {
        System.err.println("Liscov Substitution Principle");

        Shape rectangle = new Rectangle(10, 20);

        Shape square = new Square(9);

        System.out.println("Rectangle: " + rectangle.getArea());
        System.out.println("Square: " + square.getArea());

    }
}
