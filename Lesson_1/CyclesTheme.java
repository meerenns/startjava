import java.util.Random;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. ВЫВОД ASCII-СИМВОЛОВ\n");

        System.out.printf("%-10s %-10s %s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 33; i <= 47; i++) {
            if (i % 2 != 0) {
                System.out.printf("%-10d %-10c %s%n", i, (char) i, Character.getName(i));
            }
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                System.out.printf("%-10d %-10c %s%n", i, (char) i, Character.getName(i));
            }
        }

        System.out.println("\n2. ВЫВОД ГЕОМЕТРИЧЕСКИХ ФИГУР\n");

        for (int i = 1; i <= 5; i++) {
            System.out.print("---------- ");
            for (int j = 0; j < 6 - i; j++) {
                System.out.print("*");
            }
            System.out.print(" ");
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("^");
            }
            System.out.println();
        }

        System.out.println("\n3. ВЫВОД ТАБЛИЦЫ УМНОЖЕНИЯ\n");

        System.out.print("  |");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.println("--+------------------------");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%1d |", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК\n");

        int number = 1;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (number < 24) {
                    System.out.printf("%4d", number);
                    number += 2;
                } else {
                    System.out.printf("%4d", 0);
                }
            }
            System.out.println();
        }

        System.out.println("\n5. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX\n");

        int firstNumber = 10;
        int secondNumber = 5;
        int thirdNumber = -1;
        int max = firstNumber;
        int min = firstNumber;

        if (secondNumber > max) {
            max = secondNumber;
        }

        if (thirdNumber > max) {
            max = thirdNumber;
        }

        if (secondNumber < min) {
            min = secondNumber;
        }

        if (thirdNumber < min) {
            min = thirdNumber;
        }

        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n6. РАЗНЫЕ ОПЕРАЦИИ НАД ЧИСЛОМ\n");

        int initialNumber = 2234321;
        int workingNumber = initialNumber;

        int reversedNumber = 0;
        int countOfTwos = 0;

        while (workingNumber > 0) {
            int digit = workingNumber % 10;

            if (digit == 2) {
                countOfTwos++;
            }

            reversedNumber = reversedNumber * 10 + digit;
            workingNumber /= 10;
        }

        System.out.printf("%d - %sпалиндром с %s (%d) количеством двоек%n",
                reversedNumber,
                initialNumber == reversedNumber ? "" : "не ",
                countOfTwos % 2 == 0 ? "четным" : "нечетным",
                countOfTwos);

        System.out.println("\n7. ПРОВЕРКА СЧАСТЛИВОГО ЧИСЛА\n");

        int originalNumber = 101002;
        int currentNumber = originalNumber;

        int rightSum = 0;
        int leftSum = 0;

        for (int i = 0; i < 3; i++) {
            rightSum += currentNumber % 10;
            currentNumber /= 10;
        }

        for (int i = 0; i < 3; i++) {
            leftSum += currentNumber % 10;
            currentNumber /= 10;
        }

        System.out.printf("%d - %sсчастливое число%n",
                originalNumber,
                leftSum == rightSum ? "" : "не ");

        System.out.printf("Сумма цифр %03d = %d%n", originalNumber % 1000, rightSum);
        System.out.printf("Сумма цифр %03d = %d%n", originalNumber / 1000, leftSum);

        System.out.println("\n8. ПРОСТОЙ ГЕНЕРАТОР ПАРОЛЯ\n");

        Random random = new Random();

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        System.out.print("Пароль: ");

        for (int i = 0; i < 8; i++) {
            int type = random.nextInt(4);
            char symbol;

            if (type == 0) {
                symbol = (char) random.nextInt(97, 123);
                hasLower = true;
            } else if (type == 1) {
                symbol = (char) random.nextInt(65, 91);
                hasUpper = true;
            } else if (type == 2) {
                symbol = (char) random.nextInt(48, 58);
                hasDigit = true;
            } else {
                symbol = (char) random.nextInt(33, 48);
                hasSpecial = true;
            }

            System.out.print(symbol);
        }

        System.out.print("\nНадежность: ");

        if (hasLower && hasUpper && hasSpecial) {
            System.out.println("Надежный");
        } else if (hasUpper || hasDigit) {
            System.out.println("Средний");
        } else {
            System.out.println("Слабый");
        }
    }
}