package Arrays.ArrayOperations.LongestEvenOddSubArray;

import Arrays.ArrayOperations.TakeInput.getInput;

public class LongestEvenOddSubArray {
    public static void main(String[] args) {
        int arr[] = getInput.getArrayInput();
        executeEfficientMethod(arr, arr.length);
        executeNaiveMethod(arr, arr.length);

    }

    private static void executeNaiveMethod(int[] arr, int n) {
        int res = 1;
        for(int i = 0; i< n; i++){
            for(int j = i+1; j <n;j++){
                if(((arr[j] % 2==0)&&(arr[i] % 2!=0)) || ((arr[j] % 2!=0)&&(arr[i] % 2==0))){
                    res++;
                }
                else break;
            }
        }
        System.out.println("Naive  Method : ");
        System.out.println("Answer : " + res);

    }

    //NEED TO ADD EFFICIENT SOLUTION
    private static void executeEfficientMethod(int[] arr, int n) {
        boolean isPrevEven = false;
        boolean isCurrEven =false;
        int res = arr[0];
        int currSum =arr[0];
        int count = 0;
        for(int i = 1; i < n; i++){
            if(arr[i-1] % 2 == 0){
                isPrevEven = true;
            }
            if(arr[i] %2 == 0){
                 isCurrEven = true;
            }
            if((isPrevEven && !isCurrEven) || (!isPrevEven && isCurrEven)){
                count++;
            }

        }
        System.out.println("Efficient Method: ");
        System.out.println("Answer : "+ count);
    }
}
