package HW2java.ex3;

public class PrinterTextCleaner {
    public static void main(String[] args) {
        String text = "";
        if (args.length == 0) {
            text = "line1\n\nline2\n\nline3";
        } else {
            text = args[0];
        }
        TextCleaner ans = new TextCleaner();
        System.out.println(ans.removeEmptyLines(text));
    }
}