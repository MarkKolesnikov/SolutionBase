package solution.smallestnumber;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вывести первое число: ");
        double x = in.nextDouble();
        System.out.println("Вывести второе число: ");
        double y = in.nextDouble();
        System.out.println("Вывести третье число: ");
        double z = in.nextDouble();
        System.out.print("Меньшее среднее " + smallest(x, y, z)+"\n" );
    }

    private static double smallest(double x, double y, double z) {
        return Math.min(Math.min(x,y), z);
    }
}
