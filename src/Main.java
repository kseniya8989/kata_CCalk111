import java.io.PrintStream;
import java.util.Scanner;
public class Main {
    public static int result;

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите пример: ");
        String vvod = scan.nextLine();
        calc(vvod);
    }

    public static String calc(String input) throws Exception {

        String[] words = input.split(" ");
        int a = Integer.parseInt(words[0]);
        int b = Integer.parseInt(words[2]);

        switch (words[1]) {
            case "+":
                result = a + b;
                break;
            case "-":
                result = a - b;
                break;
            case "/":
                result = a / b;
                break;
            case "*":
                result = a * b;
                break;
            default:
                throw new Exception("Некоректная операция! ");

        }

        if ( (a>=1 && a<=10) && (b>=1 && b<=10) ) {
            System.out.print(result);
        }else {
            throw new Exception("Ошибка! ");
        }

        return input;
    }
}





