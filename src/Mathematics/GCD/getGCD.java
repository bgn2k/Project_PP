package Mathematics.GCD;

import java.lang.reflect.Array;

public class getGCD {
    public static void main(String[] args) {
        // int a = 12, b = 33;
        int a = 3, b = 6;
        // int output = getGCD(a, b);
        int output = getGCDApproach2(a,b);
        System.out.println("Input: a : " + a + " b : "+b+" \tOutput: "+output);
    }
    //NAIVE APPROACH
    private static int getGCD(int a, int b) {
        int res = Math.min(a, b);
        while(res > 0){
            if(a % res == 0 && b % res == 0){
                break;
            }
            res--;
        }
        return res;
    }
    //Efficient Approach - Euclideans Theorem
    public static int getGCDApproach2(int a, int b){
        int n = Math.max(a,b);
        int m = Math.min(a,b);
        int r = 0;
        while(m != 0){
            r = n%m;
            n=m;m=r;
        }
        return n;
    }
}
