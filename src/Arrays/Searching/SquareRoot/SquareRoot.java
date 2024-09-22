package Arrays.Searching.SquareRoot;

import Arrays.ArrayOperations.TakeInput.getInput;

public class SquareRoot {
    public static void main(String[] args) {
        int target = getInput.getSearchElement();
        int answer = executeEfficientMethod(target);
        System.out.println("Answer: " + answer);
    }

    private static int executeEfficientMethod(int x) {
        if(x == 0 || x == 1)
            return x;
        long low = 1, high = x/2, ans = 0;
        while(low <= high){
            long mid = (low + high)/2;
            int sq = (int)(mid * mid);
            if(sq == x)
                return (int)mid;
            else if(x > sq){
                low = mid + 1;
                ans = mid;
            }
            else{
                high = mid - 1;
            }
        }
        return (int)ans;
    }

}
