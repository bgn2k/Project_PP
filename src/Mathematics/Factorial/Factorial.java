package Mathematics.Factorial;

public class Factorial {
    public static void main(String[] args) {
        int num = 4;
        int output = getFactorial(num);
        System.out.println("Input: "+num+"\tOutput: "+output);
    }

    private static int getFactorial(int num) {
        if(num == 0){
            return 1;
        }


        return num * getFactorial(num - 1);
    }
}
