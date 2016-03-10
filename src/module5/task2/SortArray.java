package module5.task2;

import module5.task1.ArrayHelper;

public class SortArray {

    public static void main(String[] args) {

        Integer[] arr = ArrayHelper.read();

        System.out.println("Input array: ");
        ArrayHelper.out(arr);

        arr = ArrayHelper.sortArray(arr);

        System.out.println("Sorted array: ");
        ArrayHelper.out(arr);
    }
}
