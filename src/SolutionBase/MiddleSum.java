package SolutionBase;
import java.util.Scanner;
public class MiddleSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        double number;

        System.out.println("Введите числа, для выхода введите любой нечисловой символ: ");

        while (scanner.hasNextDouble()) {
            number = scanner.nextDouble();
            sum += number;
            count++;
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое: " + average);

        } else {
            System.out.println("Вы не ввели ни одного числа.");
        }
        scanner.close();
    }
}
