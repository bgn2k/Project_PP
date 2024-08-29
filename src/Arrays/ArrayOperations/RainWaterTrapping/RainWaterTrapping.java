package Arrays.ArrayOperations.RainWaterTrapping;

import Arrays.ArrayOperations.TakeInput.getInput;
/*
Our Task: Given an array of N non-negative integers arr[ ] representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after rain.
Note: The array elements represent the height of the bars.
Examples:
Input: arr[]   = {3, 0, 2, 0, 4}
Output: 7
Explanation: Structure is like below.
We can trap “3 units” of water between 3 and 2,
“1 unit” on top of bar 2 and “3 units” between 2 and 4.

 */
public class RainWaterTrapping {
    public static void main(String[] args) {
        int arr[] = getInput.getArrayInput();
        int n = arr.length;
        executeNaiveMethod(arr, n);
        executeEfficientMethod(arr, n);

    }

    private static void executeEfficientMethod(int[] arr, int n) {
        int res = 0;
        int lmax[] = new int[n];
        int rmax[] = new int[n];
        lmax[0] = arr[0];
        for(int i = 1; i < n; i++){
            lmax[i] = Math.max(lmax[i -1],arr[i] );
        }
        rmax[n - 1] = arr[n - 1];
        for(int i = n - 2; i >= 0; i--){
            rmax[i] = Math.max(rmax[i + 1], arr[i]);
        }
        for(int i= 1; i< n-1;i++){
            res += (Math.min(lmax[i], rmax[i]) - arr[i]);
        }
        System.out.println("Efficient Method Answer: "+res);
    }

    private static void executeNaiveMethod(int[] arr, int n) {
        int res = 0;
        for(int i = 1; i < n - 1; i++){
            int lmax = arr[i];
            for(int j = 0; j < i; j++){
                lmax = Math.max(lmax, arr[j]);
            }
            int rmax = arr[i];
            for(int j = i + 1; j< n; j++){
                rmax = Math.max(rmax, arr[j]);
            }
            res += (Math.min(lmax, rmax) - arr[i]);
        }
        System.out.println("Naive Method Answer: "+ res);
    }
}
