package Arrays.ArrayOperations.MaxOccuredInteger;

import java.util.Scanner;

public class MaxOccuredInteger {
    public static void main(String[] args) {
//        int n = 5;
//        int l[] = {1,5,9,13,21};
//        int r[] = {15,8,12,20,30};
//        int max = 30;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter N: ");
        int n = scan.nextInt();
        System.out.println("Enter elements for L[]");
        int l[] = new int[n];
        for(int i = 0; i< n;i++){
            l[i] = scan.nextInt();
        }
        System.out.println("Enter elements for R[]");
        int r[] = new int[n];
        for(int i = 0; i< n;i++){
            r[i] = scan.nextInt();
        }
        int max = r[0];
        for (int num: r){
            if(num > max)
                max = num;
        }
        System.out.println("Maximum R range: " + max);

        int maxOccurredInteger = executeEffecientMethod(n, l, r, max);
        System.out.println("Max Occurred Integer: " + maxOccurredInteger);
    }

    private static int executeEffecientMethod(int n, int[] l, int[] r, int maxx) {
        int freq[] = new int[maxx+2];
        for(int i = 0; i<n;i++){
            freq[l[i]]++;
            freq[r[i]+1]--;
        }
        int resIndex = 0;
        int maxElement = freq[0];
        for(int i = 1; i<maxx+2;i++){
            freq[i] += freq[i - 1];
            if(freq[i] > maxElement){
                maxElement = freq[i];
                resIndex = i;
            }
        }
        return resIndex;
    }
}
