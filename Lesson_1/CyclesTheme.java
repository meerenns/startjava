import java.util.Random;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. ВЫВОД ASCII-СИМВОЛОВ\n");

        System.out.printf("%s   %s   %s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");

        for (int i = 33; i <= 122; i++) {
            if ((i <= 47 && i % 2 != 0) || (i >= 97 && i <= 122 && i % 2 == 0)) {
                System.out.printf("%4d%11c%12s%-10s%n",
                        i,
                        (char) i,
                        "",
                        Character.getName(i));
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
        System.out.println("\n--+------------------------");
        for (int i = 2; i <= 9; i++) {
            System.out.printf("%1d |", i);
            for (int j = 2; j <= 9; j++) {
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }

        System.out.println("\n4. ВЫВОД ЧИСЕЛ В НЕСКОЛЬКО СТРОК\n");

        int number = 1;
        int count = 0;

        while (number < 24) {
            System.out.printf("%4d", number);
            number += 2;
            count++;

            if (count % 5 == 0) {
                System.out.println();
            }
        }

        while (count % 5 != 0) {
            System.out.printf("%4d", 0);
            count++;
        }

        System.out.println("\n\n5. ВЫВОД ЧИСЕЛ МЕЖДУ MIN И MAX\n");

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
        int currentNumber = initialNumber;

        int reversedNumber = 0;
        int countOfTwos = 0;

        while (currentNumber > 0) {
            int digit = currentNumber % 10;

            if (digit == 2) {
                countOfTwos++;
            }

            reversedNumber = reversedNumber * 10 + digit;
            currentNumber /= 10;
        }

        System.out.printf("%d - %sпалиндром с %s (%d) количеством двоек%n",
                reversedNumber,
                initialNumber == reversedNumber ? "" : "не ",
                countOfTwos % 2 == 0 ? "четным" : "нечетным",
                countOfTwos);

        System.out.println("\n7. ПРОВЕРКА СЧАСТЛИВОГО ЧИСЛА\n");

        initialNumber = 101002;
        currentNumber = initialNumber;

        int rightSum = 0;
        int leftSum = 0;

        for (int i = 0; i < 6; i++) {
            int digit = currentNumber % 10;

            if (i < 3) {
                rightSum += digit;
            } else {
                leftSum += digit;
            }

            currentNumber /= 10;
        }

        System.out.printf("%d - %sсчастливое число%n",
                initialNumber,
                leftSum == rightSum ? "" : "не ");

        System.out.printf("Сумма цифр %03d = %d%n", initialNumber % 1000, rightSum);
        System.out.printf("Сумма цифр %03d = %d%n", initialNumber / 1000, leftSum);

        System.out.println("\n8. ПРОСТОЙ ГЕНЕРАТОР ПАРОЛЯ\n");

        Random random = new Random();

        int length = random.nextInt(6, 13);

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        System.out.print("Пароль: ");

        for (int i = 0; i < length; i++) {
            char symbol = (char) random.nextInt(33, 123);

            if (Character.isLowerCase(symbol)) {
                hasLower = true;
            } else if (Character.isUpperCase(symbol)) {
                hasUpper = true;
            } else if (Character.isDigit(symbol)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }

            System.out.print(symbol);
        }

        System.out.print("\nНадежность: ");

        if (length >= 8 && hasLower && hasUpper && hasSpecial) {
            System.out.println("Надежный");
        } else if (length >= 8 && (hasUpper || hasDigit)) {
            System.out.println("Средний");
        } else {
            System.out.println("Слабый");
        }
    }
}