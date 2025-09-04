package activities;

public class Activity4 {
    public static void main(String[] args) {
        // Initialize array with random order numbers
        int[] numbers = {25,10,35,17,26,56,25,22,12};

        // Display original array
        System.out.println("Before Sorting:");
        printArray(numbers);

        // Apply insertion sort
        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }

        // Display sorted array
        System.out.println("After Sorting:");
        printArray(numbers);
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}