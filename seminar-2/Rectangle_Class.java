class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    };

    public double getArea () {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public boolean isSquare() {
        return this.width == this.height;
    }

    public void scale(double factor) {
        this.width *= factor;
        this.height *= factor;
    }

    public void scale(double widthFactor, double heightFactor) {
        this.width *= widthFactor;
        this.height *= heightFactor;
    }

    public void print() {
        System.out.println("Width: " + width + ", height: " + height);
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Square?: " + isSquare());
    }

    static Rectangle compareArea(Rectangle r1, Rectangle r2) {
        if (r1.getArea() > r2.getArea()) {
            return r1;
        } else if (r2.getArea() > r1.getArea()) {
            return r2;
        }
        return null;
    }
}

public class Rectangle_Class {
public static void main(String[] args) {
        // Create three Rectangle objects
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(7, 7);
        Rectangle r3 = new Rectangle(3, 8);

        // Print their details
        System.out.println("=== Rectangle 1 ===");
        r1.print();

        System.out.println("\n=== Rectangle 2 ===");
        r2.print();

        System.out.println("\n=== Rectangle 3 ===");
        r3.print();

        // Scale rectangle 1 by a factor of 2
        System.out.println("\nScaling Rectangle 1 by factor 2...");
        r1.scale(2);
        r1.print();

        // Scale rectangle 3 by different factors
        System.out.println("\nScaling Rectangle 3 by widthFactor=1.5 and heightFactor=0.5...");
        r3.scale(1.5, 0.5);
        r3.print();

        // Compare areas of two rectangles
        System.out.println("\nComparing Rectangle 1 and Rectangle 2 by area:");
        Rectangle bigger = Rectangle.compareArea(r1, r2);
        if (bigger != null) {
            System.out.println("The rectangle with the larger area is:");
            bigger.print();
        } else {
            System.out.println("Both rectangles have the same area.");
        }
    }
}
