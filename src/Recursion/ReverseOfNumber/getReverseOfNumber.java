package Recursion.ReverseOfNumber;

import java.util.Scanner;

public class getReverseOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt();
//        int n = 12345;
        getReverse(n);
    }
    static void getReverse(int n) {
        if(n/10 < 1){
            System.out.print(n);
            return;
        }
        int digit = n % 10;
        System.out.print(digit);
        getReverse(n/10);
    }
}
