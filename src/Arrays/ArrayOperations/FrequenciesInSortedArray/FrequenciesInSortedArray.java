package Arrays.ArrayOperations.FrequenciesInSortedArray;

import Arrays.ArrayOperations.TakeInput.getInput;
/*
In a realm where numbers hold secrets, a captivating challenge awaits, which is to, Find the Frequencies in a Sorted Array !!!

Our Task: Given a sorted array, arr[] consisting of N integers, the task is to find the frequencies of each array element.



Examples:

Input: arr[] = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10}
Output:       Frequency of 1 is: 3
              Frequency of 2 is: 1
              Frequency of 3 is: 2
              Frequency of 5 is: 2
              Frequency of 8 is: 3
              Frequency of 9 is: 2
              Frequency of 10 is: 1
Input: arr[] = {2, 2, 6, 6, 7, 7, 7, 11}
Output:        Frequency of 2 is: 2
               Frequency of 6 is: 2
               Frequency of 7 is: 3
               Frequency of 11 is: 1

 */
public class FrequenciesInSortedArray
{
    public static void main(String[] args) {
//        int[] arr = getInput.getArrayInput();
//        int[] arr = {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10};
//        int[] arr = {1,1,1,1,1};
        int[] arr = {1, 2, 3,4,8, 9, 10};
        int n = arr.length;
        executeEfficientMethod(arr, n);

    }

    private static void executeEfficientMethod(int[] arr, int n) {
//      {1, 1, 1, 2, 3, 3, 5, 5, 8, 8, 8, 9, 9, 10}
//       0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13
        int count = 1;
        for (int i = 1; i < n; i++) {
            if(arr[i] != arr[i-1]){
                System.out.println("Frequency of "+arr[i-1]+" is: " + count);
                count = 1;
            }else{
                ++count;
            }

        }
        System.out.println("Frequency of "+arr[n-1]+" is: " + count);
    }
}
//1 1 1 2 3 3 5 5 8 8 8 9 9 10
