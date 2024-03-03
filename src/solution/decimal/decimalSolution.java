package solution.decimal;
import java.util.Scanner;

public class decimalSolution {
    public static void main(String[] args) {
        int dec_numb, quot, i = 1, j;
        int[] bin_numb = new int[100];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input decimal number: ");
        dec_numb = scanner.nextInt();

        quot = dec_numb;

        while (quot != 0) {
            bin_numb[i++] = quot % 2;
            quot = quot / 2;
        }

        System.out.println("Binary is name: ");
        for (j = i - 1; j > 0; j--) {
            System.out.println(bin_numb[j]);
        }
        System.out.println("\n");
    }
}
