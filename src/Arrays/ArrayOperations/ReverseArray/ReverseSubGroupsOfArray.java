package Arrays.ArrayOperations.ReverseArray;

import Arrays.ArrayOperations.TakeInput.getInput;

import java.util.Scanner;

public class ReverseSubGroupsOfArray {
    public static void main(String[] args) {
        int arr[] = getInput.getArrayInput();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter K : ");
        int k = scan.nextInt();
        int resultArr[] = getReverseArray(arr, k);
        System.out.println("Result: ");
        for (int i :resultArr
             ) {
            System.out.print(i+" ");
        }
    }

    private static int[] getReverseArray(int[] arr, int k) {
        int i = 0, j = k -1;
        int reversedArray[] = new int[arr.length];
        if(k >= arr.length){
            k = arr.length;
            return reverseSubArray(arr, i, j);
        }
            for (i = 0; i < arr.length; i = i + k) {
                int left = i;
                int right = Math.min(i+k - 1, arr.length- 1);
                reversedArray = reverseSubArray(arr, left,right);
            }

        return reversedArray;
    }

    private static int[] reverseSubArray(int arr[], int i, int j) {
        int temp = 0;
        while(i < j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
        return arr;
    }
}
