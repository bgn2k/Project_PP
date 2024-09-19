package Arrays.Searching.BinarySearch;

import Arrays.ArrayOperations.TakeInput.getInput;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = getInput.getArrayInput();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter target value: ");
        int target = scan.nextInt();
        int position = executeBinarySearch(arr, arr.length, target);
        System.out.println("Position of target: " + target + " is: "+position);

    }

    private static int executeBinarySearch(int[] arr, int n, int target) {
        int low = 0; int high = n-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target)
                return mid+1;
            else if(target < arr[mid])
                high = mid -1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
