//This approach will always fail of overflow issues lets move on to the efficient method.
package Mathematics.TrailingZereosInFactorial;

public class FactorialTrailingZeroes {
    public static void main(String[] args) {
        int n = 30;
        int output = getTrailingZeroes(n);
        System.out.println("Input : " + n + "\tOutput: " + output);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static int getTrailingZeroes(int n) {
        int factorial = fact(n);
        System.out.println("Factorial: " + factorial);
        int count = 0;
        while (factorial % 10 == 0) {
            count++;
            factorial = factorial / 10;
        }
        return count;
    }

}
