package solution.smallestnumber;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вывести первое число: ");
        double x = in.nextDouble();
        System.out.println("Вывести первое число: ");
        double y = in.nextDouble();
        System.out.println("Вывести первое число: ");
        double z = in.nextDouble();
        System.out.print("The smallest value is " + smallest(x, y, z)+"\n" );
    }

    private static double smallest(double x, double y, double z) {
        return Math.min(Math.min(x,y), z);
    }
}
