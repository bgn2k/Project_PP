package Arrays.Searching.PeakElement;

import Arrays.ArrayOperations.TakeInput.getInput;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = getInput.getArrayInput();
        int ans = executeEfficientMethod(arr, arr.length);
        System.out.println("Answer: "+ ans);
    }

    private static int executeEfficientMethod(int[] arr, int n) {
        int low = 0, high = n - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(((mid == 0) || (arr[mid - 1] <= arr[mid])) && ((mid == n- 1)|| (arr[mid + 1] <= arr[mid]))){
                return arr[mid];
            }
            else if((mid > 0) && (arr[mid - 1] >= arr[mid]))
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
