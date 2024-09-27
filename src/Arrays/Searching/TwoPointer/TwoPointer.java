package Arrays.Searching.TwoPointer;

import Arrays.ArrayOperations.TakeInput.getInput;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = getInput.getArrayInput();
        int target = getInput.getSearchElement();
        int ans[] = executeEfficientMethod(arr, arr.length,target);
        System.out.println("Answer: ");
        for (int n:ans
             ) {
            System.out.print(n+",");
        }
    }

    private static int[] executeEfficientMethod(int[] arr, int n, int x) {
        int[] res = new int[2];
        int low = 0, high = arr.length - 1;
        while(low < high){
            if((arr[low] + arr[high]) == x){
                res[0] = low;res[1] = high;
                return res;
            }
            else if(arr[low] + arr[high] > x)
                high--;
            else
                low++;
        }
        return res;
    }
}
