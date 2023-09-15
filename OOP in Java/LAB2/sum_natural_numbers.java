// Create a class named sum_natural_numbers
public class sum_natural_numbers {
    public static void main(String[] args) {
        // Declare and initialize variables
        int sum = 0;
        int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Print a message to indicate the first 10 natural numbers are being printed
        System.out.println("First 10 Natural Numbers are:");
        // Loop through the array of the first 10 natural numbers and print each number
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }
        // Print a blank line for formatting
        System.out.println("");
        // Loop through the array of the first 10 natural numbers and add each number to the sum
        for (int i = 0; i < 10; i++) {
            sum += array[i];
        }
        // Print the sum of the first 10 natural numbers
        System.out.println("The Sum of First 10-Natural Numbers is:" + sum);
    }
}
