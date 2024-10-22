package HW3java.ex2;

import java.util.Arrays;

public class Printer {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
                    a = new int[]{1, 2, 2, 3, 4, 4, 5};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        UniqueElements answer = new UniqueElements();
        String itresume_res =
                Arrays.toString(answer.getUniqueElements(a));
        System.out.println(itresume_res);
    }
}
