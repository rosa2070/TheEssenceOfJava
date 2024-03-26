package ch3.quiz;

public class Exercise3_9 {
    public static void main(String[] args) {
        char ch = 'z';
        boolean b = (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || ('0' <= ch && ch <= '9');
        System.out.println("b = " + b);
    }
}
