package Arrays.Searching.IndexOfFirstOccurrence;

import Arrays.ArrayOperations.TakeInput.getInput;

public class IndexOfFirstOccurrence {
    public static void main(String[] args) {
        int[] arr = getInput.getArrayInput();
        int target = getInput.getSearchElement();
        int answer = executeEfficientMethod(arr, arr.length, target);
        System.out.println("Answer:" +answer);
    }

    private static int executeEfficientMethod(int[] arr, int n, int target) {
        int low = 0, high = n -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(target < arr[mid])
                high = mid - 1;
            else if(target > arr[mid])
                low = mid + 1;
            else{
                if(mid == 0 || (arr[mid - 1] != arr[mid])){
                    return mid;
                }else{
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}
