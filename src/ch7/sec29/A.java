package ch7.sec29;

public class A {
    void methodA() {
        I i = InstanceManager.getInstance();
        i.methodB();
        System.out.println(i.toString());
    }

}
