package Arrays.ArrayOperations.MaxSumInCircularArray;

import Arrays.ArrayOperations.TakeInput.getInput;

public class MaxSumInCircularArray {
    public static void main(String[] args) {
        int arr[] = getInput.getArrayInput();
        int answer = executeEfficientMethod(arr);
        System.out.println("Efficient Answer : " + answer);
    }

    private static int executeEfficientMethod(int[] nums) {
        int currMax = 0, currMin = 0, resMax = nums[0], resMin = nums[0], total = 0;
        for(int i = 0; i< nums.length; i++){
            currMax = Math.max(currMax + nums[i], nums[i]);
            resMax = Math.max(currMax, resMax);
            currMin = Math.min(currMin+nums[i], nums[i]);
            resMin = Math.min(currMin, resMin);
            total += nums[i];
        }
        if(resMax < 0){
            return resMax;
        }
        else{
            return Math.max(resMax, total - resMin);
        }

    }
}
