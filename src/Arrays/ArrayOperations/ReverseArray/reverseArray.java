package Arrays.ArrayOperations.ReverseArray;

import Arrays.ArrayOperations.TakeInput.getInput;

public class reverseArray {
    public static void main(String[] args) {
        int arr[] = getInput.getArrayInput();
        int result[] = getReverseOfArray(arr);
        System.out.println("Reversed Array: ");
        for (int i: result
             ) {
            System.out.print(i+" ");
        }
    }

    private static int[] getReverseOfArray(int[] arr) {
        int newArr[] = new int[arr.length];
        int i = 0, j = arr.length - 1;
        while(i < j){
            newArr[i] = arr[j];
            newArr[j] = arr[i];
            i++;
            j--;
        }
        return newArr;
    }
}