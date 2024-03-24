package solution.arrays;

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {

        // Тут мы задаем и инициализируем массивы.
        int[] my_array1 = {
                1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2165, 1457, 2456
        };

        // Declare and initialize a string array.
        String[] my_array2 = { // Initialize the string array.
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

        // Берем наш массив и печатаем его.
        System.out.println("Original numeric array : " + Arrays.toString(my_array1)); // Print the original numeric array.

        // Sort the numeric array in ascending order.
        Arrays.sort(my_array1);

        // Print the sorted numeric array.
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));

        // Print the original string array.
        System.out.println("Original string array : " + Arrays.toString(my_array2));

        // Sort the string array in lexicographical (alphabetical) order.
        Arrays.sort(my_array2);

        // Print the sorted string array.
        System.out.println("Sorted string array : " + Arrays.toString(my_array2));
    }
}
