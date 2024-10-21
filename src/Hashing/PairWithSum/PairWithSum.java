package Hashing.PairWithSum;

import Arrays.ArrayOperations.TakeInput.getInput;

import java.util.HashSet;

public class PairWithSum {
    public static void main(String[] args) {
        int[] arr = getInput.getArrayInput();
        int sum = getInput.getSearchElement();
        boolean ans = executeNaiveSoln(arr, sum);
        System.out.println("Naive Answer: " + ans);
        boolean effAns = executeEffSoln(arr, sum);
        System.out.println("Eff Answer: " + effAns);
    }

    private static boolean executeEffSoln(int[] arr, int sum) {
        HashSet<Integer> map = new HashSet<>();
        for (int i: arr
             ) {
            int comp = sum - i;
            if(map.contains(comp)){
                return true;
            }
            map.add(i);
        }
        return false;
    }

    private static boolean executeNaiveSoln(int[] arr, int sum) {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if( i == j){
                    continue;
                }
                if(arr[i] + arr[j] == sum){
                    return true;
                }
            }
        }
        return false;
    }
}
