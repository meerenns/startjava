import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        String answer = "yes";

        while (answer.equals("yes") || answer.equals("YES")) {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();

            System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();

            double result = calculator.calculate(a, operator, b);

            System.out.println(a + " " + operator + " " + b + " = " + result);

            System.out.print("Хотите продолжить вычисления? [yes/no]: ");
            answer = scanner.next();

            while (!(answer.equals("yes") || answer.equals("YES") ||
                     answer.equals("no") || answer.equals("NO"))) {
                System.out.println("Введите yes или no");
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answer = scanner.next();
            }
        }

        System.out.println("Программа завершена");
    }
}