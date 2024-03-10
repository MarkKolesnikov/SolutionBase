package solution.middlecharacter;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вывод строки: ");
        String str = in.nextLine();
        System.out.println("The middle character in the string: " + middle(str)+"\n");
    }

    private static String middle(String str) {
        int length = str.length();
        int position = (length % 2 == 0) ? (length / 2 - 1) : (length / 2);
        int offset = (length % 2 == 0) ? 2 : 1;
        return str.substring(position, position + offset);
    }
}
