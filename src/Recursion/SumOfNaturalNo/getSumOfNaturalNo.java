package Recursion.SumOfNaturalNo;

import java.util.Scanner;

public class getSumOfNaturalNo {
    public static void main(String[] args) {
        int no;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter No: ");
        no = scan.nextInt();
        int output = getSumOfNaturalNo(no);
        System.out.println("Output : "+output);
    }

    private static int getSumOfNaturalNo(int no) {
        if(no <= 1)
            return no;
        return no + getSumOfNaturalNo(no - 1);
    }
}
