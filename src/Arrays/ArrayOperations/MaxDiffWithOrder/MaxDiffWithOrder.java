package Arrays.ArrayOperations.MaxDiffWithOrder;

import Arrays.ArrayOperations.TakeInput.getInput;

public class MaxDiffWithOrder {
    public static void main(String[] args) {
        int[] arr = getInput.getArrayInput();
        executeNaiveApproach(arr);
        executeEfficientApproach(arr);
    }

    private static void executeEfficientApproach(int[] arr) {
        int n = arr.length;
        int min = arr[0];//This is the smallest we have seen so far
        int maxDiff = arr[1]- arr[0];//This is the initial diff. we cant write min because the value of the min will get updated everytime
        for (int i = 1; i < n; i++) {
            int diff = arr[i] - min;//Finding the profit refer chat gpt example buy sell
            if(diff > maxDiff){
                maxDiff = diff;
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Efficient Approach Method: ");
        System.out.println("Answer : " + maxDiff);
    }

    private static void executeNaiveApproach(int[] arr) {
        int n = arr.length;
        int maxDiff = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <n ; j++) {
                if((arr[j] - arr[i] > maxDiff) ){
                    maxDiff = arr[j] - arr[i];
                }
            }

        }
        System.out.println("Naive Method: ");
        System.out.println("Answer: " + maxDiff);
    }
}
