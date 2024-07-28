package Recursion.CountZeroes;

import java.util.Scanner;

public class CountZeroes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no it can be either binary or integer: ");
        int n = scan.nextInt();
        int count = 0;
        int answer;
        if(n == 0)
            answer = 1;
        else{
            answer = getZeroCount(n, count);
        }
        System.out.println("ZERO COUNT : "+answer);

    }
    private static int getZeroCount(int n, int count) {
        if(n/10 < 1)
            return count;
        int digit = n % 10;
        if(digit == 0){
            count++;
            return getZeroCount(n/10, count);
        }else{
            return getZeroCount(n/10, count);
        }
    }
}
