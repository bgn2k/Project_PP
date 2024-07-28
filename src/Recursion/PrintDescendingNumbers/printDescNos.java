package Recursion.PrintDescendingNumbers;

public class printDescNos {
    public static void main(String[] args) {
        int n = 5;
//        System.out.println(printDescNumbers(5));
        printDescNumbers(n);
    }

    private static void printDescNumbers(int i) {
        if(i == 1){
            System.out.println(i);
            return;
        }
        System.out.println(i);
        printDescNumbers(i-1);
    }
}
