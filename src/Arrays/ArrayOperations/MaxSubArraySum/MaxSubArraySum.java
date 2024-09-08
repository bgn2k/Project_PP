package Arrays.ArrayOperations.MaxSubArraySum;

import Arrays.ArrayOperations.TakeInput.getInput;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int arr[] = getInput.getArrayInput();
        executeEfficientMethod(arr, arr.length);
    }

    private static void executeEfficientMethod(int[] arr, int n) {
        int res = arr[0];
        int currSum =arr[0];
        for(int i = 1; i < n; i++){
            currSum = Math.max(arr[i], currSum + arr[i]);
            res = Math.max(res, currSum);
        }
        System.out.println("Efficient Method: ");
        System.out.println("Ansewr : "+ res);
    }

}
