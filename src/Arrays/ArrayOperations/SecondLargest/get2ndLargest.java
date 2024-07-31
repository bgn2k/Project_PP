package Arrays.ArrayOperations.SecondLargest;

import Arrays.ArrayOperations.TakeInput.getInput;

public class get2ndLargest {
    public static void main(String[] args) {
        int arr[] = getInput.getArrayInput();
//        int result = get2ndLargestElement(arr);
//        System.out.println("2nd Largest = "+result);

        int efficientResult = getEfficientMethodForFetching2ndLargest(arr);
        System.out.println("2nd Largest Element : " + arr[efficientResult]);
    }

    private static int get2ndLargestElement(int[] arr) {
        int max = getLargest(arr);
        int maxNum = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] == max)
                break;
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    private static int getLargest(int[] arr) {
        int maxNum = arr[0];
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i] > maxNum){
                maxNum = arr[i];
            }
        }
        return maxNum;
    }
    public static int getEfficientMethodForFetching2ndLargest(int arr[]){
        int res = -1, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arr[max]){
                res = max;
                max = i;
            }else if(arr[i] != arr[max]){
                if(res == -1 || arr[i] > arr[res] ){
                    res = i;
                }
            }
        }
        return res;
    }

}
