package net.ukr.mironovakatty;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class SteppedArray {
    private static final int NOT_DEFINED_MIN_VALUE = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter rows count (N): ");
        int rowsCount = scanner.nextInt();
        System.out.print("Enter max columns count (M): ");
        int maxColumnsCount = scanner.nextInt();

        solve(rowsCount, maxColumnsCount, -10, 10);

    }

    private static void solve(int rowsCount, int maxColumnsCount, int minValue, int maxValue) {
        System.out.println("1. Generated stepped array:");
        int[][] matrix = generate(rowsCount, maxColumnsCount);
        fillWithRandomValues(matrix, minValue, maxValue);
        print(matrix);

        System.out.println("\n2. Sorted matrix:");
        sort(matrix);
        print(matrix);

        System.out.println("\n3. Total sum == " + sumAll(matrix));

        System.out.println("\n4.a Min element for each rows:");
        int[] minElements = findMinElements(matrix);
        printMinimums(minElements);

        System.out.print("\n4.b Absolute minimum == ");
        int absoluteMin = findMinElement(minElements);
        printMinimumValue(absoluteMin);

        System.out.println("\n5 Divide each elements");
        divide(matrix, absoluteMin);
        print(matrix);
    }

    public static int[][] generate(int rowsCount, int maxColumnsCount) {
        int[][] result = new int[rowsCount][];
        for (int i = 0; i < result.length; i++) {
            int columns = ThreadLocalRandom.current().nextInt(maxColumnsCount);
            result[i] = new int[columns];
        }

        return result;
    }
    public static void fillWithRandomValues(int[][] matrix, int minValue, int maxValue) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(minValue, maxValue);
            }
        }
    }

    public static void print(int[][] matrix) {
        System.out.println("[");
        for (int[] row : matrix) {
            System.out.print("   [");
            for (int i = 0; i < row.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.printf("%3d", row[i]);
            }
            System.out.println("]");
        }
        System.out.println("]");
    }

    public static int[] findMinElements(int[][] matrix) {
        int[] minElements = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            minElements[i] = findMinElement(matrix[i]);
        }

        return minElements;
    }

    public static int findMinElement(int[] array) {
        if (array.length == 0) {
            return NOT_DEFINED_MIN_VALUE;
        }

        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }


    public static void printMinimums(int[] minValues) {
        for (int i = 0; i < minValues.length; i++) {
            System.out.printf("Row #%2d min value: ", i);
            printMinimumValue(minValues[i]);
        }
    }

    public static void printMinimumValue(int minValue) {
        if (minValue == NOT_DEFINED_MIN_VALUE) {
            System.out.println("NOT DEFINED");
        } else {
            System.out.println(minValue);
        }
    }


    public static long sumAll(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int element : row) {
                sum += element;
            }
        }

        return sum;
    }

    public static void sort(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (i % 2 == 0) {
                sortAscending(matrix[i]);
            } else {
                sortDescending(matrix[i]);
            }
        }
    }

    public static void sortAscending(int[] array) {
        Arrays.sort(array);
    }

    public static void sortDescending(int[] array) {
        sortAscending(array);
        for (int i = 0; i < array.length; i++) {
            int tmp = array[i];
            int j = array.length - 1 - i;
            array[i] = array[j];
            array[j] = tmp;
        }
    }

    public static void divide(int[][] matrix, int divider) {
        if (divider == 0 || divider == NOT_DEFINED_MIN_VALUE) {
            System.out.println("Can't divide!(");
            return;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] /= divider;
            }
        }
    }
}