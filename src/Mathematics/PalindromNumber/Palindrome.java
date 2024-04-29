package Mathematics.PalindromNumber;

public class Palindrome {
    public static void main(String[] args) {
        int input1 = 12321;
        boolean output1 = checkIfPalindrome(input1);
        System.out.println("Input : "+input1+"\tOutput : "+output1);
    }

    private static boolean checkIfPalindrome(int input) {
        if(input/10 == 0){
            return true;
        }
        int num = input;
        int rev = 0;
        int x;
        while (num > 0) {
            x = num%10;
            num = num/10;
            rev = rev*10+x;
        }

        return (rev == input);
    }
}
