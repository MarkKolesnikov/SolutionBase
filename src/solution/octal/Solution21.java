package solution.octal;

import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long binaryNumber, decimalNumber = 0, j = 1;
        long remainder;


        System.out.print("Введите двоиченое число: ");
        binaryNumber = sc.nextLong();

        while (binaryNumber != 0) {
            remainder = binaryNumber % 10;
            decimalNumber = decimalNumber + remainder * j;
            j = j * 2;
            binaryNumber = binaryNumber / 10;
        }

        System.out.print("Десятичное число: " + decimalNumber);
    }
}
