package Arrays.ArrayOperations.RemoveDuplicatesFromSortedArray;

import Arrays.ArrayOperations.TakeInput.getInput;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int arr[] = getInput.getArrayInput();
        getArr(arr);
    }

    private static void getArr(int[] arr) {
        int res = 0;
        for(int i = 1; i<arr.length;i++){
            if(arr[i] != arr[res -1 ]){
                arr[res] = arr[i];
                res++;
            }
        }
        for (int i : arr
             ) {
            System.out.print(i+" ");
        }
    }
}
