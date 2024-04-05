package ch7.quiz.quiz22;

public class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this(new Point(0, 0), width, height);
    }

    Rectangle(Point p, double width, double height) {
        super(p);
        this.width = width;
        this.height = height;
    }

    boolean isSquare() {
        return width*height != 0 && width == height;
    }
    public double calcArea() {
        return width * height;
    }
}
