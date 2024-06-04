package Recursion.TotalDigitsCount;

import java.util.Scanner;

public class getCountForDigits {
    public static void main(String[] args) {
        Scanner getNo = new Scanner(System.in);
        System.out.print("Enter No: ");
        int n = getNo.nextInt();
        int output = getCount(n);
        System.out.println("Output: "+output);
    }

    private static int getCount(int n) {
        if(n/10 == 0)
            return 1;
        return 1 + getCount(n/10);
    }

}
