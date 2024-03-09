package solution.index;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input weight in pounds: ");
        double weight = sc.nextDouble();

        System.out.println("Input height in inches: ");
        double inches = sc.nextDouble();

        double BMI = weight * 0.45359237 / (inches * 0.0254 * inches * 0.0254);
        System.out.println("Body mass Index is: " + BMI+"\n");
    }
}
