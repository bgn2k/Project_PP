package Arrays.ArrayOperations.EquilibriumPoint;

import Arrays.ArrayOperations.TakeInput.getInput;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int arr[] = getInput.getArrayInput();
        System.out.println("isEquilibrium: " + executeEfficientMethod(arr, arr.length));
    }

    private static boolean executeEfficientMethod(int[] arr, int n) {
        int rightSum = 0;
        for(int num : arr){
            rightSum += num;
        }
        int leftSum = 0;
        for(int i = 0; i< n;i++){
            rightSum -= arr[i];
            if(leftSum == rightSum)
                return true;
            leftSum += arr[i];
        }
        return false;
    }
}
