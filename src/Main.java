import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println(findFactorial());
        //System.out.println(evenNum());
        //System.out.println(sumOfDig());
        //System.out.println(maxOfNum());


    }

    public static int findFactorial(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = scanner.nextInt();
        int factorial = 1;
        if (num < 0 ) {
            return - 1;
        } else if (num > 0) {
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }

        }
        return factorial;

    }

    public static String evenNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = scanner.nextInt();
        for (int i = 2; i <= num; i += 2) {
            System.out.println(i);

        }
        return "";


    }

    public static int sumOfDig(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int num = scanner.nextInt();
        int sumDigits = 0;
        while (num != 0){
            sumDigits += num % 10;
            num /= 10;
        }
        return sumDigits;
    }

    public static int maxOfNum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int res = 0;

        if (a >= b & a >= c) {
            res = a;
        } else if (b >= a & b >= c) {
            res = b;
        } else if (c >= a & c >= b) {
            res = c;

        }
        return res;


    }

}


