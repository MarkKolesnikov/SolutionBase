package solution.vowels;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Вывод строки: ");
        String str = in.nextLine();

        System.out.println("Number of  Vowels in the string: " + count_Vowels(str)+"\n");
    }

    private static int count_Vowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
            }
            count++;
        }
        return count;
    }
}
