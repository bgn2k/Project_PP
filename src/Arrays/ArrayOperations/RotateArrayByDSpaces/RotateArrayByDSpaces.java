package Arrays.ArrayOperations.RotateArrayByDSpaces;

import Arrays.ArrayOperations.TakeInput.getInput;

import java.util.Scanner;

public class RotateArrayByDSpaces {
    public static void main(String[] args) {
        int arr[] = getInput.getArrayInput();
        System.out.println("Enter by how many digits you want to rotate : ");
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        executeEfficientMethod(arr, k);
    }

    private static void executeEfficientMethod(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
        System.out.println("Efficient Answer: ");
        for (int i:
arr             ) {
            System.out.print(i+" ");
        }
    }

    private static void reverse(int[] arr, int left, int right) {
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++; right--;
        }
    }
}
