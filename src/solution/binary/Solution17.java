package solution.binary;
import java.util.Scanner;
public class Solution17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        int num1 = in.nextInt();

        System.out.print("Input second binary number: ");
        int num2 = in.nextInt();

        int sum = Integer.parseInt(String.valueOf(num1), 2) + Integer.parseInt(String.valueOf(num2), 2);
        System.out.println("Сумма двоичных чисел: " + Integer.toBinaryString(sum));
    }
}