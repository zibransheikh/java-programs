class Rectangle {
    int length, width;

    // Constructor with two parameters
    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    // Constructor with one parameter (square)
    Rectangle(int side) {
        length = width = side;
    }

    // Method
    int area() {
        return length * width;
    }
}
public class overload {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5); // rectangle
        Rectangle r2 = new Rectangle(7);     // square

        System.out.println("Area of Rectangle: " + r1.area());
        System.out.println("Area of Square: " + r2.area());
    }
}
