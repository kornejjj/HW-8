// Базовый абстрактный класс Shape
abstract class Shape {
    // Абстрактный метод для получения имени фигуры
    public abstract String getName();

    // Метод для вывода имени фигуры
    public void printName() {
        System.out.println(getName());
    }
}

// Класс-наследник Circle
class Circle extends Shape {
    @Override
    public String getName() {
        return "Circle";
    }
}

// Класс-наследник Square
class Square extends Shape {
    @Override
    public String getName() {
        return "Square";
    }
}

// Класс-наследник Triangle
class Triangle extends Shape {
    @Override
    public String getName() {
        return "Triangle";
    }
}

// Класс-наследник Rectangle
class Rectangle extends Shape {
    @Override
    public String getName() {
        return "Rectangle";
    }
}

// Класс-наследник Pentagon
class Pentagon extends Shape {
    @Override
    public String getName() {
        return "Pentagon";
    }
}

// Класс для работы с фигурами
class ShapePrinter {
    public void printShapeName(Shape shape) {
        shape.printName();
    }
}

// Главный класс с примером использования
public class Main {
    public static void main(String[] args) {
        // Создаем экземпляры фигур
        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape pentagon = new Pentagon();

        // Создаем экземпляр ShapePrinter
        ShapePrinter printer = new ShapePrinter();

        // Выводим названия фигур
        printer.printShapeName(circle);
        printer.printShapeName(square);
        printer.printShapeName(triangle);
        printer.printShapeName(rectangle);
        printer.printShapeName(pentagon);
    }
}
