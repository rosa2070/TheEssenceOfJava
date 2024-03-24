package ch8.quiz.quiz3;

public class Parent {
    int a;
    int b;

    Parent() {
        this(0,0);
    }

    Parent(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void add(int a, int b)
        throws InvalidNumberException, NotANumberException {}
}
