package Mathematics.TrailingZereosInFactorial;

public class EfficientMethod {
    public static void main(String[] args) {
        int n = 30;
        int output = getTrailingZeroes(n);
        System.out.println("Input : " + n + "\tOutput: " + output);
    }

    private static int getTrailingZeroes(int n) {
        int res = 0;
        int powerOf5 = 5;
        while(n >= powerOf5){
            res = res + n/powerOf5;
            powerOf5 *= 5;
        }
        return res;
    }
}
