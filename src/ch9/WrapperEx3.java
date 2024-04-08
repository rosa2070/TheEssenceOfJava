package ch9;

public class WrapperEx3 {
    public static void main(String[] args) {
        int i = 10;

        Integer intg = (Integer) i;
        Object obj = (Object) i;

        Long lng = 100L;

        int i2 = intg + 10;
        long l = intg + lng;

        int i3 = (int)intg;

        Integer intg3 = intg + i3;

    }
}
