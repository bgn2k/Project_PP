package Arrays.ArrayOperations.CheckSorted;

import Arrays.ArrayOperations.TakeInput.getInput;

public class checkSorted {
    public static void main(String[] args) {
        int[] arr = getInput.getArrayInput();
        boolean flag = isSorted(arr);
        if(flag){
            System.out.println("Array Is Sorted");
        }else{
            System.out.println("Array Is Not Sorted");
        }
    }

    private static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] < arr[i - 1])
                return  false;
        }
        return  true;
    }
}
