package ch7.quiz.quiz25;

public class Exercise7_25 {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner ii = o.new Inner();
        System.out.println(ii.iv);
    }
}
