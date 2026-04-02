public class Calculator {
    public static void main(String[] args) {
        int a = 2;
        int b = 10;
        char op = '^';
        int result = 0;

        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;
        } else if (op == '*') {
            result = a * b;
        } else if (op == '/') {
            result = a / b;
        } else if (op == '%') {
            result = a % b;
        } else if (op == '^') {
            result = 1;
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        }
        System.out.printf("%d %c %d = %d%n", a, op, b, result);
    }
}