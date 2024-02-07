package solution.middlesum;
import java.util.Scanner;
public class Solution12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int n = in.nextInt();
        int[] numbers = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Введите " + (i + 1) + "-е число: ");
            numbers[i] = in.nextInt();
            sum += numbers[i];
        }
        double average = (double) sum / n;
        System.out.println("Среднее значение " + n + " чисел: " + average);
    }

}