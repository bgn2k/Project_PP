package Hashing.HappyNumber;

import Arrays.ArrayOperations.TakeInput.getInput;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int num = 19;
        boolean flag = executeEfficientSoln(num);
        System.out.println("Is " + num + " a happy number: " + flag);
    }

    private static boolean executeEfficientSoln(int num) {

        Set<Integer> nums = new HashSet<>();
        while(true){
            int sum = 0;
            while(num != 0){
                sum += Math.pow(num % 10, 2);
                num /= 10;
            }
            if(sum == 1)
                return true;
            num = sum;
            if(nums.contains(num))
                return false;
            nums.add(num);
        }
    }
}
