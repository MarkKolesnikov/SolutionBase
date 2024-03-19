package solution.arrays;

import java.util.Arrays;

public class Exercise8 {
    public static void main(String[] args) { // main method
        // Declare and initialize an integer array 'my_array'.
        int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        // Declare and initialize a new integer array 'new_array' with the same size.
        int[] new_array = new int[10];

        // Print the source array using Arrays.toString() method.
        System.out.println("Source Array : " + Arrays.toString(my_array)); // [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]

        // Loop to copy elements from the source array to the new array.
        for (int i = 0; i < my_array.length; i++) {
            new_array[i] = my_array[i];
        }

        // Print the new array containing copied elements.
        System.out.println("New Array: " + Arrays.toString(new_array)); // [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]
    }
}