package Arrays.Searching.IndexOfFirstAndLastOccurrence;

import Arrays.ArrayOperations.TakeInput.getInput;

public class IndexOfFirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = getInput.getArrayInput();
        int target = getInput.getSearchElement();
        int[] answer = getFirstAndLastOccurrence(arr, target);
        System.out.println("Answer:");
        for (int num : answer
             ) {
            System.out.print(num+" ");
        }



    }

    private static int[] getFirstAndLastOccurrence(int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = binSearch(arr, target, true);
        ans[1] = binSearch(arr, target ,false);
        return ans;
    }

    public static int binSearch(int[] arr, int target, boolean b) {
        int index = -1;
        int low = 0, high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(target < arr[mid])
                high = mid - 1;
            else if(target > arr[mid])
                low = mid + 1;
            else if( arr[mid] == target){
                index = mid;
                if(b){
                    high = mid -1 ;
                }else{
                    low = mid + 1;
                }
            }

        }
        return index;
    }
}
