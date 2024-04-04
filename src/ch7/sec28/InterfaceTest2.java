package ch7.sec28;

public class InterfaceTest2 {
    public static void main(String[] args) {
        A a = new A();
        a.autoPlay(new B());
        a.autoPlay(new C( ));
    }
}
