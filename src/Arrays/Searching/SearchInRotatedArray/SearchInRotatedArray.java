package Arrays.Searching.SearchInRotatedArray;

import Arrays.ArrayOperations.TakeInput.getInput;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = getInput.getArrayInput();
        int target = getInput.getSearchElement();
        int ans = executeEfficientMethod(arr, arr.length, target);
        System.out.println("Answer: " + ans);
    }

    private static int executeEfficientMethod(int[] arr, int n, int x) {
        int low = 0, high = n - 1;
        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == x)
                return mid;
            if(arr[low] == arr[mid] && arr[mid] == arr[high]){
                low++;high--;
            }else if(arr[low] <= arr[mid]){ // This checks which side of the array is sorted
                if(x >= arr[low] && x < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }else{
                if(x >= arr[mid] && x < arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
}
