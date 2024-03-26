package ch3.quiz;

public class Exercies3_7 {
    public static void main(String[] args) {
        int farenheit = 100;
        float celcius = (int) ((5/9f * (farenheit - 32))*100 + 0.5) / 100f;

        System.out.println("farenheit = " + farenheit);
        System.out.println("celcius = " + celcius);


    }
}
