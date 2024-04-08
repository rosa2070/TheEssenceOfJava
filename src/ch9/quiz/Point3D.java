package ch9.quiz;

public class Point3D {
    int x,y,z;

    Point3D(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    Point3D() {
        this(0,0,0);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Point3D) {
            Point3D p = (Point3D) obj;
            return x == p.x && y == p.y && z == p.z;
        }
        return false;
    }

    public String toString() {
        return "[" + x + "," + y + "," + z + "]";
    }
}
