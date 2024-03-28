package ch4.quiz;

public class quiz4 {
    public static void main(String[] args) {
        int sum=0;
        int num=1;
        while (true) {

            num = (num%2==0?-num:num);
            sum+=num;
            if (sum >= 100)
                break;
            num = Math.abs(num) + 1;
        }
        System.out.println("sum = " + sum);
        System.out.println("num = " + num);
    }
}
