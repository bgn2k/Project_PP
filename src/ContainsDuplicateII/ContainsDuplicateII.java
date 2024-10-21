package ContainsDuplicateII;

import Arrays.ArrayOperations.TakeInput.getInput;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
//        int[] arr = getInput.getArrayInput();
//        int k = getInput.getSearchElement();
//        int arr[] = {1,2,3,1,2,3};
//                int k = 2;
        int arr[] = {0,1,2,3,4,0,0,7,8,9,10,11,12,0};
        int k = 1;
//        int arr[] = {1,0,1,1};
//int k = 1;
//                int arr[] = {1,2,3,1};
//int k = 3;

        boolean ans = executeEffSoln(arr, k);
        System.out.println("Answer: " + ans);
    }

    private static boolean executeEffSoln(int[] arr, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        boolean flag = false;
        for(int i = 0; i<arr.length; i++){
            if(!hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], i);
            }  else{
                flag =  Math.abs(i - hashMap.get(arr[i])) <= k;
                if(!flag){
                    hashMap.put(arr[i],i);
                }else return true;
            }
        }
        return flag;
    }
}
