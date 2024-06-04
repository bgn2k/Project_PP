package Recursion.RopeCuttingProblem;

import java.util.Scanner;

public class getMaxCuts {
    public static void main(String[] args) {
        /*
         * Given a rope of length N meters, and the rope can be cut in only 3 sizes A, B
         * and C. The task is to maximizes the number of cuts in rope. If it is
         * impossible to make cut then print the number else print -1. Examples:
         * 
         * Input:
         * 
         * N = 17, A = 10, B = 11, C = 3
         * 
         * Output: 3
         * 
         * Explanation: The maximum cut can be obtain after making 2 cut of length 3 and
         * one cut of length 11.
         * 
         * Input: N = 10, A = 9, B = 7, C = 11
         * 
         * Output: -1
         * 
         * Explanation: It is impossible to make any cut so output will be -1.
         */
        int n, a, b, c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N:");
        n = scan.nextInt();
        System.out.print("Enter a:");
        a = scan.nextInt();
        System.out.print("Enter b:");
        b = scan.nextInt();
        System.out.print("Enter c:");
        c = scan.nextInt();
        int output = getMaxCutsForRopes(n, a, b, c);
        System.out.println("Output : " + output);
    }

    public static int getMaxCutsForRopes(int n, int a, int b, int c) {
        if (n == 0)
            return 0;
        if (n <= -1)
            return -1;
        int res = Math.max(getMaxCutsForRopes(n - a, a, b, c),
                Math.max(getMaxCutsForRopes(n - b, a, b, c), getMaxCutsForRopes(n - c, a, b, c)));
        if (res == -1)
            return -1;
        return res + 1;

    }
}
