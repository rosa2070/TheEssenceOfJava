package ch7;

public class Point {
    int x=10;
    int y=20;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

/*    Point() {
        this(0,0);
    }*/

    String getXY() {
        return "(" + x + "," + y + ")";
    }

    String getLocation() {
        return "x :" + x + ", y :" + y;
    }
}
