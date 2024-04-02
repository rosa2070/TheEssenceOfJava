package ch7.sec12;

public class FinalCardTest {
    public static void main(String[] args) {
        Card c = new Card("HEART", 10);
//        c.NUMBER = 10;
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
        System.out.println(c);
    }
}
