package Arrays.Searching.CountOfOccurrence;

import Arrays.ArrayOperations.TakeInput.getInput;
import Arrays.Searching.IndexOfFirstAndLastOccurrence.IndexOfFirstAndLastOccurrence;

public class CountOfOccurrence {
    public static void main(String[] args) {
        int[] arr = getInput.getArrayInput();
        int target = getInput.getSearchElement();
        int count= getCountOfOccurrence(arr, target);
        System.out.println("Count Of Target " + target + " = "+count);
    }

    private static int getCountOfOccurrence(int[] arr, int target) {
        int[] ans = new int[2];
        ans[0] = IndexOfFirstAndLastOccurrence.binSearch(arr, target, true);
        ans[1] = IndexOfFirstAndLastOccurrence.binSearch(arr, target ,false);
        if(ans[0] == -1 && ans[1] == -1)
            return 0;
        return (ans[1] - ans[0]) + 1;
    }
}
