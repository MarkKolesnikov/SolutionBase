package solution.octalnumber;

import java.util.Scanner;

public class Solution24 {
    public static void main(String[] args) {
        int biennium, rem, binnum, decorum = 0, quot, i = 1, j;
        int[] ununoctium = new int[100];

        Scanner sc = new Scanner(System.in);

        System.out.print("Введите двоичное число: ");
        biennium = sc.nextInt();
        binnum = biennium;

        while (biennium > 0) {
            rem = biennium % 10;
            decorum = decorum + rem * i;
            i = i * 2;
            biennium = biennium / 10;
        }

        i = 1;
        quot = decorum;

        while (quot > 0) {
            ununoctium[i++] = quot % 8;
            quot = quot / 8;
        }

        System.out.print("Эквивалентное Восьмеричное значение " + binnum + " is : ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(ununoctium[j]);
        }
        System.out.print("\n");
    }
}
