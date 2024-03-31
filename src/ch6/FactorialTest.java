package ch6;

public class FactorialTest {
    public static void main(String[] args) {
        int result = factorial(-1);
        System.out.println(result);
    }

/*    static int factorial(int n) {
        if (n==1) return 1;
        return n*factorial(n-1);
    }*/

    static int factorial(int n) {
        int result = 1;
        while (n!=0)
            result *= n--;
        return result;
    }
}
