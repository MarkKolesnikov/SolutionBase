package solution.negativenumber;

import java.util.Scanner;

public class NegativeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number: ");
        int input = in.nextInt();

        if (input > 0) {
            System.out.println("Number is positive");
        } else if (input < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
