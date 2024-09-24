package Arrays.Searching.SearchInSortedArray;

import Arrays.ArrayOperations.TakeInput.getInput;

public class SearchInSortedArray {
    public static void main(String[] args) {
        int[] arr = getInput.getArrayInput();
        int target = getInput.getSearchElement();
        int index = executeEfficientSoln(arr, arr.length, target);
        System.out.println("Answer: " + index);
    }

    private static int executeEfficientSoln(int[] arr, int n, int x) {
        int low  = 0;
        int high = n - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == x)
                return mid;
            if(arr[low] <= arr[mid]){
            if((arr[low] <= x) && (x < arr[mid])){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
            }
            else{
                if((x > arr[mid]) &&( x<= arr[high])){
                    low = mid + 1;
                }else{
                    high = mid -1 ;
                }
            }
        }
        return -1;
    }
}
