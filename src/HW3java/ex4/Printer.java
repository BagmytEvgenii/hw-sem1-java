package HW3java.ex4;

import java.util.Arrays;

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Printer {
    public static void main(String[] args) {
        int[] a;
        if (args.length == 0) {
// При отправке кода на Выполнение, вы можете варьировать эти параметры
                    a = new int[]{4, 2, 7, 5, 2};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }
        AverageCalculator answer = new AverageCalculator();
        int result = answer.calculateAverage(a);
        System.out.println(result);
    }
    
}
