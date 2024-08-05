package Arrays.ArrayOperations.RearrangeArrayElements;

import Arrays.ArrayOperations.TakeInput.getInput;

public class RearrangeArrayElements {
    public static void main(String[] args) {
        /*
Given an array arr[] of size N where every element is in the range from 0 to n-1. Rearrange the given array so that the transformed array arrT[i] becomes arr[arr[i]].

NOTE: arr and arrT are both same variables, representing the array before and after transformation respectively.

Example 1:

Input:
N = 2
arr[] = {1,0}
Output: 0 1
Explanation:
arr[arr[0]] = arr[1] = 0
arr[arr[1]] = arr[0] = 1
So, arrT becomes {0, 1}
Example 2:

Input:
N = 5
arr[] = {4,0,2,1,3}
Output: 3 4 2 0 1
Explanation:
arr[arr[0]] = arr[4] = 3
arr[arr[1]] = arr[0] = 4
arr[arr[2]] = arr[2] = 2
arr[arr[3]] = arr[1] = 0
arr[arr[4]] = arr[3] = 1
and so on
So, arrT becomes {3, 4, 2, 0, 1}

*/
//        System.out.println(3 % 4);
        int arr[] = getInput.getArrayInput();
        System.out.println("Given Array: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        getNaiveMethod(arr);

        getEfficientMethod(arr);

    }

    private static void getEfficientMethod(int[] arr) {
        System.out.println("\nYet To Write The Method");
        System.out.println(3 % 5);
    }

    private static void getNaiveMethod(int[] arr) {
        int temp[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++){
            temp[i] = arr[arr[i]];
        }
        System.out.println("");
        for (int i:temp) {
            System.out.print(i+" ");
        }
    }
}
