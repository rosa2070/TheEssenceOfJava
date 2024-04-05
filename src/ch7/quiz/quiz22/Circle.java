package ch7.quiz.quiz22;

public class Circle extends Shape {
    double r;

    Circle(double r) {
        this(new Point(0,0), r);
    }

    Circle(Point p, double r) {
        super(p);
        this.r = r;
    }

    public double calcArea() {
        return Math.PI * r * r;
    }
}
