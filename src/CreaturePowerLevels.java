import java.util.Scanner;

public class CreaturePowerLevels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Input the Power Levels
        int[] powerLevels = new int[10];
        System.out.println("Enter the power levels of 10 creatures:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Power level " + (i + 1) + ": ");
            powerLevels[i] = sc.nextInt();
        }

        // 2. Bubble Sort Implementation (Ascending order)
        bubbleSortAscending(powerLevels);
        System.out.println("Sorted Power Levels (Ascending order):");
        displayArray(powerLevels);

        // 3. Selection Sort Implementation (Descending order)
        selectionSortDescending(powerLevels);
        System.out.println("Sorted Power Levels (Descending order):");
        displayArray(powerLevels);

        // 4. Calculate and Display Analysis
        int sumEven = calculateSumEven(powerLevels);
        int sumOdd = calculateSumOdd(powerLevels);
        int minPower = findMin(powerLevels);
        int maxPower = findMax(powerLevels);

        System.out.println("\nAnalysis:");
        System.out.println("Sum of Even Power Levels: " + sumEven);
        System.out.println("Sum of Odd Power Levels: " + sumOdd);
        System.out.println("Minimum Power Level: " + minPower);
        System.out.println("Maximum Power Level: " + maxPower);

        sc.close();
    }

    // Bubble Sort in Ascending Order
    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Selection Sort in Descending Order
    public static void selectionSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[maxIdx]) {
                    maxIdx = j;
                }
            }
            // Swap
            int temp = arr[maxIdx];
            arr[maxIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // Display the array
    public static void displayArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // Calculate sum of even numbers
    public static int calculateSumEven(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Calculate sum of odd numbers
    public static int calculateSumOdd(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }

    // Find minimum power level
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    // Find maximum power level
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }
}
