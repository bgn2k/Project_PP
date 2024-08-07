package Arrays.ArrayOperations.LeadersInAnArray;

import Arrays.ArrayOperations.TakeInput.getInput;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int arr[] = getInput.getArrayInput();
        executeNaiveMethod(arr);
        executeEfficientMethod(arr);
    }

    private static void executeEfficientMethod(int[] arr) {
        int n = arr.length;
        System.out.println("\nEfficient Method Answer: ");
        System.out.print(arr[n - 1]+" ");
        int leader = arr[n - 1];
        for (int i = n-2; i >= 0; i--) {
            if(arr[i] > leader){
                System.out.print(arr[i]+" ");
                leader = arr[i];
            }
        }
    }

    private static void executeNaiveMethod(int[] arr) {
        System.out.println("\nNaive Method Answer: ");
        int n = arr.length;
//        int result[] = new int[n];
        for(int i = 0; i< n; i++){
            boolean flag = true;
            for (int j = i+1; j < n; j++) {
                if(arr[j] >= arr[i]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.print(arr[i]+" ");
            }
        }
    }

}
