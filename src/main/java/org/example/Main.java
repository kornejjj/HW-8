package org.example;

class Main {
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
