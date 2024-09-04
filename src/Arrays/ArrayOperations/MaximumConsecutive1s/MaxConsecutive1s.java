package Arrays.ArrayOperations.MaximumConsecutive1s;

import Arrays.ArrayOperations.TakeInput.getInput;

public class MaxConsecutive1s {
    public static void main(String[] args) {
        int arr[] = getInput.getArrayInput();
        executeEfficientMethod(arr, arr.length);
    }

    private static void executeEfficientMethod(int[] arr, int n) {
        int maxCount = 0; int count = 0;
        for(int i = 0; i< n; i++){
            if(arr[i] == 1)
                count++;
            else{
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
            if(arr[i] == 1 && i == n - 1 && count != 0){
                maxCount = Math.max(maxCount, count);
            }
        }
        System.out.println("Efficient Method: ");
        System.out.println("Maximum Consecutive 1s : " + maxCount);
    }
}
