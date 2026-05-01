public class Calculator {
    public double calculate(int a, char operator, int b) {
        double result = 0;

        switch (operator) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                } else {
                    result = (double) a / b;
                }
                break;
            case '%':
                if (b == 0) {
                    System.out.println("Ошибка: деление на ноль запрещено");
                } else {
                    result = a % b;
                }
                break;
            case '^':
                result = 1.0;

                if (b >= 0) {
                    for (int i = 0; i < b; i++) {
                        result *= a;
                    }
                } else {
                    for (int i = 0; i < -b; i++) {
                        result *= a;
                    }
                    result = 1.0 / result;
                }
                break;
            default:
                System.out.println("Ошибка: операция '" + operator + "' не поддерживается");
        }

        return result;
    }
}