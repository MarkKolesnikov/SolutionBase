package solution.averagenumbers;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Вывод первого числа: ");
        int x = in.nextInt();
        System.out.print("Вывод второго числа: ");
        int y = in.nextInt();
        System.out.print("Вывод третьего числа: ");
        int z = in.nextInt();
        System.out.print("Среднее значение " + average(x, y, z)+"\n" );
    }
    public static int average(int x, int y, int z) {
        return (x + y + z) / 3;
    }
}
