package Arrays.ArrayOperations.RearrangeArrayAlternately;

import Arrays.ArrayOperations.TakeInput.getInput;
/*
Given a sorted array of positive integers. Your task is to rearrange the array elements alternatively i.e., first element should be max value, second should be min value, third should be second max, fourth should be second min and so on.
Note: Modify the original array itself. Do it without using any extra space. You do not have to return anything.

Expected Time Complexity: O(N).
Expected Auxiliary Space: O(1).Example 1:

Input:
n = 6
arr[] = {1,2,3,4,5,6}
Output: 6 1 5 2 4 3
Explanation: Max element = 6, min = 1,
second max = 5, second min = 2, and
so on... Modified array is : 6 1 5 2 4 3.
Example 2:

Input:
n = 11
arr[]={10,20,30,40,50,60,70,80,90,100,110}
Output:110 10 100 20 90 30 80 40 70 50 60
Explanation: Max element = 110, min = 10,
second max = 100, second min = 20, and
so on... Modified array is :
110 10 100 20 90 30 80 40 70 50 60.
 */
public class RearrangeArrayAlternately {
    public static void main(String[] args) {
        System.out.println("Enter Sorted Array: ");
        int[] arr = getInput.getArrayInput();
        executeNaiveMethod(arr);
        executeEfficientMethod(arr);


    }

    private static void executeEfficientMethod(int[] arr) {
        int n = arr.length;
        int left = 0, right = n -1 ;
        int maxValue = arr[n - 1] + 1;
        int i = 0;
        while(left <= right){
            //Encoding the given array elements
            if(i%2 == 0){
                arr[i] = arr[i] + (arr[right] % maxValue) * maxValue;
                right--;
            }else{
                arr[i] += (arr[left] % maxValue) * maxValue;
                left++;
            }
            i++;
        }
        for (int j = 0; j < n; j++) {
            arr[j] = arr[j] / maxValue;
        }
        System.out.println("\nEfficient Method: ");
        System.out.println("Answer: ");
        for (int element: arr
        ) {
            System.out.print(element + " ");
        }
    }

    private static void executeNaiveMethod(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int left = 0, right = n - 1, i = 0;
        while(left < right){
            temp[i] = arr[right];
            temp[++i] = arr[left];
            left++;right--;i++;
        }
        if (left == right) {
            temp[i] = arr[left];/*
            Why we have use temp[i] and not temp[n - 1] is because
            I's values is always incrementing no matter what the values of left
            and right. So.
            */
        }
        System.out.println("Naive Method: ");
        System.out.println("Answer: ");
        for (int element: temp
        ) {
            System.out.print(element+" ");
        }
//10 20 30 40 50 60 70 80 90 100 110
    }
}
