package Arrays.ArrayOperations.MajorityElement;

import Arrays.ArrayOperations.TakeInput.getInput;
/*
Majority Element

Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).

Examples :

Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4
Explanation: The frequency of 4 is 5 which is greater than the half of the size of the array size.

Input : {3, 3, 4, 2, 4, 4, 2, 4}
Output : No Majority Element
Explanation: There is no element whose frequency is greater than the half of the size of the array size.
 */
public class MajorityElement {
    public static void main(String[] args) {
        int arr[] = getInput.getArrayInput();
        executeEfficientMethod(arr, arr.length);
    }

    private static void executeEfficientMethod(int[] arr, int n) {
        int resIndex = 0, count = 1;
        for(int i = 1; i< n; i++){
            if(arr[resIndex] == arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                resIndex = i;
                count = 1;
            }
        }
        count = 0;
        for(int i = 0; i<n; i++){
            if(arr[resIndex] == arr[i]){
                count++;
            }
        }
        if(count <= n/2){
            resIndex = -1;
        }
        System.out.println("Efficient Soln : ");
        System.out.println("Answer: " + resIndex);
    }
}
