package module5.task1;

public class MinMax {

    public static void main(String[] args) {

        Integer[] arr = ArrayHelper.read();
        Integer[] minMaxValues = ArrayHelper.findMinMax(arr);

        System.out.println("Input array: ");
        ArrayHelper.out(arr);

        System.out.printf("%nmin = %s, max = %s", minMaxValues);
    }
}
