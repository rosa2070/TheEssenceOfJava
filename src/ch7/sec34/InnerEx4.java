package ch7.sec34;

public class InnerEx4 {
    public static void main(String[] args) {
        Outer oc = new Outer();
        Outer.InstanceInner ii = oc.new InstanceInner();

        System.out.println("ii.iv : " + ii.iv);
        System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);

        Outer.StaticInner si = new Outer.StaticInner();
        System.out.println("si.iv : " + si.iv);
    }
}
