package solution.Exercise32;

import java.util.Scanner;

public class Exercise32 {
    private static final double TOLERANCE = 0.01;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first floating­point number: ");
        double num1 = input.nextDouble();

        System.out.print("Input second floating­point number: ");
        double num2 = input.nextDouble();

        input.close();

        if (Math.abs(num1 - num2) <= 0.01) {
            System.out.println("These numbers are the same."); // 0.01
        } else {
            System.out.println("These numbers are different.");  // 0.01
        }
    }

    private static boolean numberAreSame(double number1, double number2) {
        return  Math.abs(number1 - number2) <= TOLERANCE; // Тут мы сравниваем два числа с точностью до 0.01
    }
}
