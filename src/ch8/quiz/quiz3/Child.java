package ch8.quiz.quiz3;

public class Child extends Parent {
    Child() {}
    Child(int a, int b) {
        super(a, b);
    }

    void add(int a, int b)
        throws InvalidNumberException, NotANumberException {}
}
