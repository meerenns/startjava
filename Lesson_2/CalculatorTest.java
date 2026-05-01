import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();

            System.out.print("Введите знак операции (+, -, *, /, ^, %): ");
            char operator = scanner.next().charAt(0);

            System.out.print("Введите второе число: ");
            int b = scanner.nextInt();

            double result = calculator.calculate(a, operator, b);

            System.out.println(a + " " + operator + " " + b + " = " + result);

            while (true) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                String answer = scanner.next();

                if (answer.equals("yes") || answer.equals("YES")) {
                    break;
                } else if (answer.equals("no") || answer.equals("NO")) {
                    System.out.println("Программа завершена");
                    return;
                } else {
                    System.out.println("Введите yes или no");
                }
            }
        }
    }
}