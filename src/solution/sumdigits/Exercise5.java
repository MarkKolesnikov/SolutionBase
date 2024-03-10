package solution.sumdigits;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вывести первый номер: ");
        int digits = in.nextInt();
        System.out.println("The sum is " + sumDigits(digits));
    }

    private static int sumDigits(long n) {
        int result = 0;

        while (n > 0) {
            result += n % 10;
            n /= 10;
        }
        return result;
    }
}
