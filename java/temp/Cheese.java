// messing around with classes

// Base class
class Shape {

    protected int width;
    protected int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

// Derived class
class Rectangle extends Shape {

    public int getArea() {
        return (super.width * super.height);
    }
}

// Another derived class
class Triangle extends Shape {

    public int getArea() {
        return (super.width * super.height) / 2;
    }
}

public class Cheese {

    public static void main(String[] args) {

        Rectangle rect = new Rectangle();
        Triangle tri = new Triangle();

        rect.setWidth(8);
        rect.setHeight(4);

        tri.setWidth(8);
        tri.setHeight(4);

        // print the area of the objects
        System.out.println("Total area of rectangle: " + rect.getArea());
        System.out.println("Total area of triangle:  " + tri.getArea());
    }
}

// END
