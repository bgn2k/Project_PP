package BitManipulation.PowerOf2;

import java.util.Scanner;

public class checkPowOf2 {
    public static void main(String[] args) {
        System.out.print("Enter No: ");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();
            boolean answer = isPowOf2(n);
            System.out.println("Output: " + answer);
    }

    private static boolean isPowOf2(int n) {
        if(n <= 0){
            return false;
        }
        int result = (n & (n - 1));
        if (result != 0){
            return false;
        }
        return true;
    }
}
