package ch4.quiz;

public class quiz3 {
    public static void main(String[] args) {
        int sum = 0;
        int totalSum = 0;

        for (int i=1; i<= 10; i++) {
            sum += i;
            totalSum += sum;
        }
        System.out.println("sum = " + totalSum);
    }
}
