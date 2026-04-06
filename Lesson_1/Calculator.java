public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        char operator = '^';
        int result = 0;

        if (operator == '+') {
            result = a + b;
        } else if (operator == '-') {
            result = a - b;
        } else if (operator == '*') {
            result = a * b;
        } else if (operator == '/') {
            result = a / b;
        } else if (operator == '%') {
            result = a % b;
        } else if (operator == '^') {
            result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        }
        System.out.printf("%d %c %d = %d%n", a, operator, b, result);
    }
}