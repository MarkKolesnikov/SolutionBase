package solution.numbermultiplier;
import java.util.Scanner;
public class NumberSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Вывод первого числа ");
        int num1 = in.nextInt();

        System.out.println("Выовод второго числа ");
        int num2 = in.nextInt();

        System.out.println(num1 + " X " + num2 + " = " + num1 * num2);
    }
}