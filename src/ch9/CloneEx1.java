package ch9;

public class CloneEx1 {
    public static void main(String[] args) {
        Point original = new Point(3, 5);
        Point copy = original.clone();
        System.out.println(original);
        System.out.println(copy);
    }
}
