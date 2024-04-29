package Mathematics.CountDigits;

public class CountDigits {
    public static void main(String[] args) {
        int input1 = 9245;
        int output1 = getCountDigits(input1);
        int input2 = 10000;
        int output2 = getCountDigits(input2);
        int input3 = 1;
        int output3 = getCountDigits(input3);
        System.out.println("Input: "+input1+"\tOutput: "+output1);
        System.out.println("Input: "+input2+"\tOutput: "+output2);
        System.out.println("Input: "+input3+"\tOutput: "+output3);
    }

    private static int getCountDigits(int input) {
        int count = 0;
        while(input != 0){
            input = input/10;
            count++;
        }
        return count;
    }
}
