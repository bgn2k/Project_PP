package Hashing.ContainsDuplicates;

import Arrays.ArrayOperations.TakeInput.getInput;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static void main(String[] args) {
        int[] arr = getInput.getArrayInput();
        boolean ans = executeEfficientSoln(arr);
        System.out.println(ans);
    }

    private static boolean executeEfficientSoln(int[] arr) {
        Set<Integer> nums = new HashSet<>();
        for (int i:
 arr             ) {
            nums.add(i);
        }
        if(nums.size() < arr.length){
            return true;
        }
        else
            return false;

    }
}
