package Recursion.PrintDescendingNumbers;

public class printDescNos {
    public static void main(String[] args) {
        int n = 5;
//        System.out.println(printDescNumbers(5));
        printDescNumbers(n);
    }

    private static void printDescNumbers(int i) {
//        https://spankbang.com/9ir0y/video/wanna+be+an+adult+boy
        if(i == 1){
            System.out.println(i);
            return;
        }
        System.out.println(i);
        printDescNumbers(i-1);
    }
}
