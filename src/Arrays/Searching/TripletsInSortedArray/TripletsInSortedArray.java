package Arrays.Searching.TripletsInSortedArray;

import Arrays.ArrayOperations.TakeInput.getInput;

public class TripletsInSortedArray {
    public static void main(String[] args) {
        int[] arr = getInput.getArrayInput();
        int target = getInput.getSearchElement();
        boolean isTarget = executeEfficientMethod(arr, target);
        System.out.println("Answer: " + isTarget);
    }

    private static boolean executeEfficientMethod(int[] arr, int target) {
        int n= arr.length;
        for(int i = 0; i< n - 2; i++){
            if(isPair(arr, target - arr[i], i+1)){
                return true;
            }

        }
        return false;

    }

    private static boolean isPair(int[] arr, int x, int start) {
        int n = arr.length;
        int i = start, j = n - 1;
        while( i < j){
            if(arr[i] + arr[j] == x)
                return true;
            else if(arr[i] + arr[j] > x)
                j--;
            else
                i++;
        }
        return false;
    }
}
