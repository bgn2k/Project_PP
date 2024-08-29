package Arrays.ArrayOperations.StockSellAndBuy;

import Arrays.ArrayOperations.TakeInput.getInput;

public class StockSellAndBuy {
    public static void main(String[] args) {
        int[] arr = getInput.getArrayInput();
        executeEfficientMethod(arr, arr.length, true);
    }

    private static void executeEfficientMethod(int[] arr, int n, boolean isEfficient) {
        int profit = 0;
        for(int i = 1; i < n; i++){
            if(arr[i] > arr[i - 1]){
                profit += (arr[i] - arr[i -1]);
            }
        }
        System.out.println("Efficient Answer:");
        System.out.println("Profit: "+profit);
    }
}
