package HW2java.ex2;
class CSVGenerator {
    public static String generateCSV(String[] headers, String[][]
            data) {
        StringBuilder csv = new StringBuilder();
// Добавление заголовков
        csv.append(String.join(",", headers)).append("\n");
// Добавление данных
        for (String[] row : data) {
            csv.append(String.join(",", row)).append("\n");
        }
        return csv.toString().trim(); // Удалить последнюю новую строку
    }
}
// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
