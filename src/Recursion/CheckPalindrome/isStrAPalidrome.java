package Recursion.CheckPalindrome;

import java.util.Scanner;

public class isStrAPalidrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = scan.next();
        Boolean output = isStrAPalidrome(str);
        if(output){
            System.out.println("The given string is a palindrome");
        }
        else
        System.out.println("Not a palindrome");
    }

    private static Boolean isStrAPalidrome(String str) {
        if(str.length() == 0 || str.length() == 1)
            return true;
        if(str.charAt(0) == str.charAt(str.length()-1))
            return isStrAPalidrome(str.substring(1, str.length()-1));
        return false;
    }
}
