public class Calculator {
    public double calculate(int a, char operator, int b) {
        switch (operator) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                if (b == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                    return 0;
                }
                return (double) a / b;

            case '%':
                if (b == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                    return 0;
                }
                return a % b;

            case '^':
                double result = 1.0;

                for (int i = 0; i < Math.abs(b); i++) {
                    result *= a;
                }

                return b < 0 ? 1.0 / result : result;

            default:
                System.out.println("Ошибка: операция '" + operator + "' не поддерживается");
                return 0;
        }
    }
}