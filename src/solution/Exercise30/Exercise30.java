package solution.Exercise30;

import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int x = in.nextInt();
        System.out.print("Input second number: ");
        int y = in.nextInt();
        System.out.print("Input third number: ");
        int z = in.nextInt();

        if (x == y && y == z) {
            System.out.println("All numbers are equal");
        } else if (x == y || y == z || x == z) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
}
