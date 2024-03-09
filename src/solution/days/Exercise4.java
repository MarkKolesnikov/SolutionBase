package solution.days;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        double minutesInYear = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);

        System.out.println("Введите количество минут: ");

        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " минуты - это примерно " + years + " годы и  " + days + " дни");
    }
}
