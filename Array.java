// Arrays & Basic Data Analysis Program
public class ArrayDataAnalysis {

    public static void main(String[] args) {

        // 1D Array
        int[] numbers = {10, 20, 5, 40, 30};

        int sum = 0;
        int max = numbers[0];
        int min = numbers[0];

        // calculate sum, max, min
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
            }

            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        double average = (double) sum / numbers.length;

        // Sorting (Ascending Order)
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

        // Display results
        System.out.println("----- 1D Array Analysis -----");
        System.out.print("Sorted Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);

        // (Multidimensional Array)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        System.out.println("\n----- 2D Array -----");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Exception Handling
        try {
            System.out.println(numbers[10]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nException Caught: Array index out of bounds");
        }
    }
}
