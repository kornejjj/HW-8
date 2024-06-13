
abstract class Shape {
    public abstract String getName();

    public void printName() {
        System.out.println(getName());
    }
}

class Circle extends Shape {
    @Override
    public String getName() {
        return "Circle";
    }
}

class Square extends Shape {
    @Override
    public String getName() {
        return "Square";
    }
}

class Triangle extends Shape {
    @Override
    public String getName() {
        return "Triangle";
    }
}

class Rectangle extends Shape {
    @Override
    public String getName() {
        return "Rectangle";
    }
}

class Pentagon extends Shape {
    @Override
    public String getName() {
        return "Pentagon";
    }
}

class ShapePrinter {
    public void printShapeName(Shape shape) {
        shape.printName();
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape pentagon = new Pentagon();

        ShapePrinter printer = new ShapePrinter();

        printer.printShapeName(circle);
        printer.printShapeName(square);
        printer.printShapeName(triangle);
        printer.printShapeName(rectangle);
        printer.printShapeName(pentagon);
    }
}
