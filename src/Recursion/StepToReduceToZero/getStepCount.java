package Recursion.StepToReduceToZero;

import java.util.Scanner;

public class getStepCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter no: ");
        int n = scanner.nextInt();
        int answer = numberOfSteps(n);
        System.out.println("OUTPUT: "+answer);
    }

    private static int numberOfSteps(int n) {
        if(n == 0){
            return 0;
        }
        int count = 0;
        return getCount(n, count);

    }

    private static int getCount(int n, int count) {
        if (n == 0) {
            return count;
        }else{
            count++;
            if(n % 2 == 0){
                return getCount(n/2, count);
            }else{
                n--;
                return getCount(n,count);
            }
        }
    }

}
