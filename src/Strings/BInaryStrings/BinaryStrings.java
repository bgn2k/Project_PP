package Strings.BInaryStrings;

public class BinaryStrings {
    public static void main(String[] args) {
        String str = "00100101";
        executeEffSol(str);
    }

    private static void executeEffSol(String str) {
        int count= 0;
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == '1'){
                count++;
            }
        }
        System.out.println("No Of Substrings: " + (count * (count - 1))/2);
    }
}
