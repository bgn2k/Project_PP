package BitManipulation.Decimal_Binary_Decimal;

import java.util.Scanner;

public class convertBits {
    public static void main(String[] args) {
        int option, reRun;
        do {
            System.out.println("Enter 1 for Decimal To Binary\nEnter 2 for Binary To Decimal: ");
            Scanner scan = new Scanner(System.in);
            option = scan.nextInt();
            if (option == 1) {
                System.out.print("Enter decimal no: ");
                int n = scan.nextInt();

                String output = getBinayEquivalent(n);
                System.out.println("Output: " + output);
            } else {
                System.out.print("Enter binary string: ");
                String n = scan.next();

                int output = getDecimalEquivalent(n);
                System.out.println("Output: " + output);
            }
            System.out.print("Do you want try again? Press 1 for YES or 0 for NO: ");
            reRun = scan.nextInt();
        } while (reRun == 1);

    }

    private static int getDecimalEquivalent(String n) {
        int output = 0;
        int power = 1;
        for (int i = n.length() - 1; i >= 0; i--) {
            if (n.charAt(i) == '1') {
                output += power;
            }
            power *= 2;
        }
        return output;
    }

    private static String getBinayEquivalent(int n) {
        int r;
        String binary = "";
        while (n >= 1) {
            r = n % 2;
            n = n / 2;
            binary = r + binary;
        }
        return binary;
    }
}
