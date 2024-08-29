package Arrays.ArrayOperations.FreqOfLimitedRangeInArr;

import Arrays.ArrayOperations.TakeInput.getInput;

public class FreqOfLimitedRangeInArr {
    public static void main(String[] args) {
//        int[] arr = getInput.getArrayInput();
        int[] arr = {2,3,2,3,5};
//        int[] arr = {3,3,3,3}; int p = 3;
//        int[] arr = {8, 9};
        int p = 5;
        executeNaiveMethod(arr, arr.length, p, false);
        executeEfficientMethod(arr, arr.length, p, true);
    }

    private static void executeEfficientMethod(int[] arr, int n, int p, boolean isEfficient) {
        int freq = 0;
        if(p > n){
            for(int i = 0; i < n; i++){
                arr[i] = 0;
            }
            getInput.printArray(arr, isEfficient);
        }else{
            for(int i = 0; i< n; i++){
                    if(arr[i] % n == p){
                        ++freq;
                    }
                arr[p - 1] += freq * n;
                p--;freq = 0;
            }
//            for(int i = 0; i<n; i++){
//
//            }
            // Decode the frequencies
            for (int i = 0; i < n; i++) {
                arr[i] = arr[i] / n; // Extract the frequency count
            }
            getInput.printArray(arr, isEfficient);
        }

    }

    private static void executeNaiveMethod(int[] arr, int n, int p, boolean isEfficient) {
        int k = 0, freq = 0;
        int[] resArr = new int[n];
        for (int i = 1; i <= n; i++) {  // Only loop up to 'n', not 'p'
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > n) {  // Ignore elements greater than 'n'
                    continue;
                }
                if (arr[j] == i) {
                    ++freq;
                }
            }
            resArr[k] = freq;
            k++;
            freq = 0;
        }
        getInput.printArray(resArr, isEfficient);//Prints the resultant array
    }
}