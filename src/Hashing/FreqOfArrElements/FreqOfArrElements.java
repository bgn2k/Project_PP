package Hashing.FreqOfArrElements;

import Arrays.ArrayOperations.TakeInput.getInput;

import java.util.HashMap;

public class FreqOfArrElements {
    public static void main(String[] args) {
        int[] arr = getInput.getArrayInput();
        executeEfficientMethod(arr, arr.length);
    }

    private static void executeEfficientMethod(int[] arr, int n) {
        HashMap<Integer, Integer> newHash = new HashMap<>();
        int count = 1;
        for(int i = 0; i < n; i++){
            if(newHash.containsKey(arr[i])){
                newHash.put(arr[i],newHash.get(arr[i]) + 1 );
            }else{
                newHash.put(arr[i], 1);
            }
        }
        System.out.println(newHash);
        //Deliberatively printing 2 souts
        newHash.forEach((key, value) ->System.out.println(key + " : " + value));
    }
}
