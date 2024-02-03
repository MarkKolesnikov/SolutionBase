package SolutionBase;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("длина прямоугольника: ");
        int length = scanner.nextInt();

        System.out.println("ширина прямоугольника: ");
        int width = scanner.nextInt();

        System.out.println("площадь прямоугольника: " + (length * width));
    }
}
