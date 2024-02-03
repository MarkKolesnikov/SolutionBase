package SolutionBase;
import java.util.Scanner;

public class Degree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Цельсий: ");
        double c = scanner.nextDouble();

        System.out.println("Фаренгейт: " + (c * 1.8 + 32));
    }
}
