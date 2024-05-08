package Mathematics.LCM;

import java.util.Scanner;

import Mathematics.GCD.getGCD;

public class getLCM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A: ");
        int a = scan.nextInt();
        System.out.println("Enter B: ");
        int b = scan.nextInt();
        int output = naiveApproach(a,b);
        int betterOutput = getLCMByMethod2(a, b);
        System.out.println("Output: "+betterOutput);
    }
//Naive Approach
    private static int naiveApproach(int a, int b) {
        int res = Math.max(a, b);
        while(true){
            if(res % a == 0 && res % b == 0){
                break;
            }
            res++;
        }
        return res; 
    }
    //Effiecient Approach = Euclideans Theorem LCM of 2 nos = product(a,b)/gcd(a/b);
    public static int getLCMByMethod2(int a, int b) {
        getGCD gcd = new getGCD();
        int gcdValue = gcd.getGCDApproach2(a, b);
        int product = a*b;
        return product/gcdValue;
    }
}
