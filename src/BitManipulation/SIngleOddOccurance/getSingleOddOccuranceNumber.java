package BitManipulation.SIngleOddOccurance;

import java.util.Scanner;

public class getSingleOddOccuranceNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = scan.nextInt();
        System.out.println("Enter array elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.print("Entered Array: ");
        for (int i : arr) {
            System.out.print(i+ ", ");
        }
        System.out.print("\n");
        int output = getOutput(arr);
        System.out.println("Output: "+output);
    }

    private static int getOutput(int[] arr) {
        int i ;
        int res = 0;
        for (i=0; i < arr.length; i++) {
            res ^= arr[i];
        }
        return res;
    }
}
