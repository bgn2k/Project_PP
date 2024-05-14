package BitManipulation.PosOfSignificantBit;

import java.util.Scanner;

import BitManipulation.Decimal_Binary_Decimal.convertBits;

public class getPos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter N : ");
        int n = scan.nextInt();
        int output = getAnswer(n);//O(LogN) TC Soln
        int betterOutput = getBetterSoln(n);
        System.out.println("\nOutput: "+betterOutput);
    

    }

    public static int getBetterSoln(int n) {
        return (int)(Math.log10(n ^ (n & n - 1))/Math.log10(2)) + 1;
    }

    private static int getAnswer(int n) {
        System.out.print("Binary Equivalent of "+ n+": ");
        convertBits newObj = new convertBits();
        String binaryEq = newObj.getBinayEquivalent(n);
        System.out.print(binaryEq);
        int pos = 0;
        int m = 1;
        while((n & m) == 0){
            m = m << 1;
            pos++;
        }
        return pos + 1;
    }

}
