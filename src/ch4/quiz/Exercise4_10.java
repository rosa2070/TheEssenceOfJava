package ch4.quiz;

public class Exercise4_10 {
/*    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        do {
            sum += num%10;
        } while((num/=10) != 0);
        System.out.println("sum = " + sum);
    }*/

    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        while (num > 0) {
            sum += num%10;
            num /= 10;
        }

        System.out.println("sum = " + sum);
    }
}
