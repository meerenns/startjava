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
                int count = b;
                if (b < 0) {
                    count = -b;
                }
                for (int i = 0; i < count; i++) {
                    result *= a;
                }
                if (b < 0) {
                    result = 1.0 / result;
                }
                return result;
            default:
                System.out.println("Ошибка: операция '" + operator + "' не поддерживается");
                return 0;
        }
    }
}