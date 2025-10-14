class Rectangle {
    private double width;
    private double height;

    Rectangle(double width, double height) {
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

}
