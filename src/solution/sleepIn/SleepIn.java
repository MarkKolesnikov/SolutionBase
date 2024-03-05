package solution.sleepIn;

import java.util.Scanner;

public class SleepIn {
    public static void main(String[] args) {

        System.out.println("Input true/false for sleeping in: ");
        boolean sleepIn = new Scanner(System.in).nextBoolean();
        System.out.println("Input true/false for weekday: ");
        boolean weekday = new Scanner(System.in).nextBoolean();
        if (sleepIn && !weekday) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
