package SolutionBase;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вывод первого числа: ");
        int num1 = scanner.nextInt();

        System.out.println("Вывод второго числа: ");
        int num2 = scanner.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
    }
}