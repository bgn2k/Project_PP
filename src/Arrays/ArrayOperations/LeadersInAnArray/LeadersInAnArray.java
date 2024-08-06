package Arrays.ArrayOperations.LeadersInAnArray;

import Arrays.ArrayOperations.TakeInput.getInput;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int arr[] = getInput.getArrayInput();
        executeNaiveMethod(arr);
    }

    private static void executeNaiveMethod(int[] arr) {
        System.out.println("\nNaive Method Answer: ");
        int n = arr.length;
//        int result[] = new int[n];
        for(int i = 0; i< n; i++){
            boolean flag = false;
            for (int j = i+1; j < n; j++) {
                if(arr[i] <= arr[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
