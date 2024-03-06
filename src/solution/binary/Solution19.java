package solution.binary;

import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        int dec_num , quot, i = 1, j; // Инициализоравли
        int[] bin_num = new int[100];

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите десятичное число: ");
        dec_num = scan.nextInt(); // Выведи число

        quot = dec_num;
        while (quot != 0) {
            bin_num[i++] = quot % 2;
            quot = quot / 2;
        }

        System.out.print("Двоичное число - это: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
    }
}
