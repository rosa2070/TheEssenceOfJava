package ch7.sec34;

public class Outer {
    class InstanceInner {
        int iv = 100;
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 300;
    }

    void MyMethod() {
        class LocalInner {
            int iv = 400;
        }
    }
}
