package HW3java.ex3;

import java.util.Arrays;

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        String[] arr;
        if (args.length == 0) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
                    arr = new String[]{"cat", "elephant", "dog", "giraffe"};
        } else {
            arr = args[0].split(", ");
        }
        FilterStrings answer = new FilterStrings();
        String itresume_res =
                Arrays.toString(answer.filterShortStrings(arr));
        System.out.println(itresume_res);
    }
}
