package module5.task1;

import java.util.Random;
import java.util.Scanner;

public class ArrayHelper {

    public static Integer[] read() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of element in array: ");
        int arrayLength = scanner.nextInt();

        System.out.print("Generate random array (0 - no): ");

        if (0 != scanner.nextInt()) {
            return ArrayHelper.getRandomArray(arrayLength);
        }

        Integer[] arr = new Integer[arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("element[%s] = ", i);
            arr[i] = scanner.nextInt();
        }

        return arr;
    }

    public static void out(Integer[] arr) {
        for (Integer element : arr) {
            System.out.printf("%5d   ", element);
        }
        System.out.println("");
    }

    public static Integer[] getRandomArray(int length) {
        Integer[] arr = new Integer[length];
        Random generator = new Random();

        for (int i = 0; i < length; i++) {
            arr[i] = generator.nextInt(200) - 100;
        }

        return arr;
    }

    public static Integer[] findMinMax(Integer[] arr) {
        Integer[] result = {arr[0], arr.length > 1 ? arr[1] : arr[0]}; // min, max

        for (Integer item : arr) {
            if (item < result[0]) {
                result[0] = item;
            }

            if (item > result[1]) {
                result[1] = item;
            }
        }

        return result;
    }

    public static Integer[] sortArray(Integer[] arr) {
        return ArrayHelper.sortArray(arr, 0, arr.length - 1);
    }

    /**
     * quicksort
     */
    public static Integer[] sortArray(Integer[] arr, int start, int finish) {

        Integer el = arr[finish - ((finish - start) / 2)];
        int i = start;
        int j = finish;

        while (i < j) {
            while (arr[i] < el) {
                i++;
            }

            while (arr[j] > el) {
                j--;
            }

            if (i <= j) {
                Integer tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;

                i++;
                j--;
            }
        }

        if (start < j) {
            ArrayHelper.sortArray(arr, start, j);
        }
        if (i < finish) {
            ArrayHelper.sortArray(arr, i, finish);
        }

        return arr;
    }
}
