package Arrays.ArrayOperations.MaxSumOfSubArray;

import Arrays.ArrayOperations.TakeInput.getInput;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] arr = getInput.getArrayInput();
        int k = 4;
        executeEfficientMethod(arr, arr.length, k);
    }

    private static void executeEfficientMethod(int[] arr, int n, int k) {
        int res = 0, currSum = 0, i =0;
        while(i < k){
            currSum += arr[i];
            i++;
        }
        res = Math.max(res, currSum);
        for(int j = k; j<n;j++){
            currSum+=arr[j] - arr[j-k];
            res = Math.max(res, currSum);
        }
        System.out.println("Efficient Answer: " + res);
    }
}
