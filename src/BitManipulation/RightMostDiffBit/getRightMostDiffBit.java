package BitManipulation.RightMostDiffBit;

public class getRightMostDiffBit {
    public static void main(String[] args) {
        int num1 = 11, num2 = 9;
        int output = getRightMostDiffBit(num1, num2);
        System.out.println("Output: "+output);
    }

    private static int getRightMostDiffBit(int n, int m) {
        int count = 0;
        if((n ^ m) == 0){
            return -1;
        }else{
            int k = n^m;
            while(k != 0 ){
                k = (k & (k -1));
                count++;
            }
            return count;
        }
    }
}
