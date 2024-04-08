package ch9;

public class WrapperEx2 {
    public static void main(String[] args) {
        int i2 = Integer.parseInt("100");
        Integer i3 = Integer.valueOf("100");

        int i4 = Integer.parseInt("100", 2);
        int i5 = Integer.parseInt("100", 8);
        int i6 = Integer.parseInt("100", 16);
        int i7 = Integer.parseInt("FF", 16);
//        int i8 = Integer.parseInt("FF");



    }
}
