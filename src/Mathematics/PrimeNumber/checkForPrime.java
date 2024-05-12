package Mathematics.PrimeNumber;

import java.util.Scanner;

public class checkForPrime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A: ");
        int n = scan.nextInt();
        int output = isPrime(n);
        System.out.println("Output: " + output);
    }

    private static int isPrime(int N) {
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if(N == 1)return 0;
            if (N % i == 0) {
                return 0;
            }
        }
        return 1;
    }
}
