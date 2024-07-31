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
}
