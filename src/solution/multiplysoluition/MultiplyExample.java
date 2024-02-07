package solution.multiplysoluition;
import java.util.Scanner;
public class MultiplyExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int sum1 = in.nextInt();

        System.out.println("Введите второе число: ");
        int sum2 = in.nextInt();

        System.out.println(sum1 + " + " + sum2 + " = " + (sum1 + sum2));
        System.out.println(sum1 + " - " + sum2 + " = " + (sum1 - sum2));
        System.out.println(sum1 + " x " + sum2 + " = " + (sum1 * sum2));
        System.out.println(sum1 + " : " + sum2 + " = " + (sum1 / sum2));
        System.out.println(sum1 + " mod " + sum2 + " = " + (sum1 % sum2));
    }
}