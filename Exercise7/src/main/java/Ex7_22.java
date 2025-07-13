public class Ex7_22 {
    public static void main(String[] args) {
        // 원 생성 및 테스트
        Circle c = new Circle();
        c.r = 5.0;
        c.setPosition(new Point(3, 4));
        System.out.println("Circle 위치: " + c.getPosition());
        System.out.println("Circle 넓이: " + c.calcArea());

        // 사각형 생성 및 테스트
        Rectangle r = new Rectangle();
        r.width = 10.0;
        r.height = 10.0;
        r.setPosition(new Point(1, 2));
        System.out.println("\nRectangle 위치: " + r.getPosition());
        System.out.println("Rectangle 넓이: " + r.calcArea());
        System.out.println("정사각형인가? " + r.isSquare());
    }
}

abstract class Shape {
    Point p;

    Shape() {
        this(new Point(0, 0));
    }

    Shape(Point p) {
        this.p = p;
    }

    abstract double calcArea();

    Point getPosition() {
        return p;
    }

    void setPosition(Point p) {
        this.p = p;
    }
}

class Point {
    int x, y;

    Point() {
        this(0, 0);
    }
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "[" + x + ", " + y + "]";
    }
}

class Circle extends Shape {
    double r;

    Circle() {
        this(1);
    }
    Circle(double r) {
        this.r = r;
    }

    double calcArea() {
        return r * r * Math.PI;
    }
}

class Rectangle extends Shape {
    double width, height;

    Rectangle() {
        this(1, 1);
    }
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double calcArea() {
        return width * height;
    }

    boolean isSquare() {
        if (width == height)
            return true;
        else
            return false;
    }
}