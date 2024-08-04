package Arrays.ArrayOperations.MoveZerosToEnd;

import Arrays.ArrayOperations.TakeInput.getInput;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[] = getInput.getArrayInput();
        int naiveAnswer[] = getNaiveAnswer(arr);
        System.out.println("Naive Answer: ");
        for (int i : naiveAnswer
             ) {
            System.out.print(i + " ");
        }
        int efficientAnswer[] = getEfficientAnswer(arr);
        System.out.println("\nEfficient Answer: ");
        for (int i : efficientAnswer
             ) {
            System.out.print(i + " ");
        }
    }

    private static int[] getNaiveAnswer(int[] arr) {
        for(int i = 0;i < arr.length; i++){
            if(arr[i] == 0){
                for(int j = i + 1; j < arr.length; j++){
                    if(arr[j] != 0){
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }

                }
            }
        }
        return arr;
    }

    private static int[] getEfficientAnswer(int[] arr){
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] != 0){
                int temp =arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
count++;
            }
        }
        return arr;
    }
}
