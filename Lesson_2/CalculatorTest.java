import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String answer = "yes";

        while (answer.equals("yes")) {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();

            System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();

            double result = calculator.calculate(a, operator, b);

            printResult(a, operator, b, result);

            answer = askToContinue(scanner);
        }

        System.out.println("Программа завершена");
    }

    private static void printResult(int a, char operator, int b, double result) {
        System.out.println(a + " " + operator + " " + b + " = " + result);
    }

    private static String askToContinue(Scanner scanner) {
        String answer = "";

        while (!answer.equals("yes") && !answer.equals("no")) {
            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next().toLowerCase();

            if (!answer.equals("yes") && !answer.equals("no")) {
                System.out.println("Введите yes или no");
            }
        }

        return answer;
    }
}