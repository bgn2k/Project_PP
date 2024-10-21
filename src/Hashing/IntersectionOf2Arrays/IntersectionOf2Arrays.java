package Hashing.IntersectionOf2Arrays;

import Arrays.ArrayOperations.TakeInput.getInput;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOf2Arrays {
    public static void main(String[] args) {
        int[] arr1 = getInput.getArrayInput();
        int[] arr2 = getInput.getArrayInput();
//        executeEfficientFunction(arr1, arr2);
        executeUnionOf2Arrays(arr1,arr2,arr1.length, arr2.length);
        int[] ans= executeEffSoln(arr1,arr2);
    }

    private static int[] executeEffSoln(int[] arr1, int[] arr2) {
        Set<Integer> newSet = new HashSet<>();
        int n = arr1.length, m = arr2.length;
        int minSize = Math.min(n,m);
        int[] ans = new int[n + m];
        if(minSize == m){
            for(int i : arr2){
                newSet.add(i);
            }
            for(int i = 0; i<n;i++){
                if(newSet.contains(arr1[i])){
                    ans[i] = arr1[i];
                }
            }
        }else {
            for(int i : arr1){
                newSet.add(i);
            }
            for(int i = 0; i<n;i++){
                if(newSet.contains(arr2[i])){
//                    ans[i] = newSet.get(arr2[i]);
                }
            }
        }
        return ans;
    }

    private static void executeUnionOf2Arrays(int[] arr1, int[] arr2, int n, int m) {
        Set<Integer> distinctArr = new HashSet<>();
        int res = 0;
        for (int i: arr1) {
            if(!distinctArr.contains(i)){
                distinctArr.add(i);
                res++;
            }
        }
        for (int i:arr2) {
            if(!distinctArr.contains(i)){
                distinctArr.add(i);
                res++;
            }
        }
//        return res;
        System.out.println("Res: " + res);
    }

    private static void executeEfficientFunction(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        Set<Integer> nums = new HashSet<>();
        for (int j : arr2) {
            nums.add(j);
        }
        System.out.println("Answer: ");
        for (int i:arr1){
            if(nums.contains(i)){
                System.out.println(i + " ");
            }
        }

    }
}
