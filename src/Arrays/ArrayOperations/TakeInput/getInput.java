package Arrays.ArrayOperations.TakeInput;

import java.util.Scanner;

public class getInput {
    public static int[] getArrayInput() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array length: ");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n ; i++) {
            arr[i] = scan.nextInt();
        }
//        System.out.print("Array: ");
//        for (int i :arr
//        ) {
//            System.out.print(i+ " ");
//        }
        return arr;
    }
    public static void printArray(int[] arr, boolean isEfficient){
        if(isEfficient){
            System.out.println("\nEfficient Method: ");
        }else{
            System.out.println("\nNaive Method: ");
        }
        System.out.println("Answer : ");
        for (int i: arr
             ) {
            System.out.print(i+" ");
        }
    }
}
