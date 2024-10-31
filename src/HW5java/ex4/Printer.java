package HW5java.ex4;

import java.util.Arrays;

// Не удаляйте и не меняйте метод Main!
public class Printer {
    public static void main(String[] args) {
        int[] initArray;
        if (args.length == 0) {
            initArray = new int[]{38, 27, 43, 3, 9, 82, 10};
        } else {
            initArray = Arrays.stream(args[0].split("  ")).mapToInt(Integer::parseInt).toArray();
        }
        System.out.println("Initial array:");
        System.out.println(Arrays.toString(initArray));
        MergeSort.mergeSort(initArray);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(initArray));
    }
}
