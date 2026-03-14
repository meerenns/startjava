import java.math.BigDecimal;
import java.math.RoundingMode;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. ПЕРЕВОД ПСЕВДОКОДА НА ЯЗЫК JAVA\n");

        boolean male = true;
        int age = 22;
        double height = 1.65;

        if (!male) {
            System.out.println("К сожалению, вакансия открыта только для мужчин.");
        } else {
            System.out.println("Пол соответствует требованиям вакансии.");
        }

        if (age > 18) {
            System.out.println("Возраст подходит для трудоустройства.");
        } else {
            System.out.println("Вы слишком молоды для этой работы.");
        }

        if (height < 1.8) {
            System.out.println("Рост не соответствует требованиям.");
        } else {
            System.out.println("Рост соответствует требованиям.");
        }

        System.out.println("\n2. ПОИСК БОЛЬШЕГО ЧИСЛА ШАГОВ\n");

        int yesterdaySteps = 7335;
        int todaySteps = 9500;

        System.out.println("Количество шагов за вчера = " + yesterdaySteps);
        System.out.println("Количество шагов за сегодня = " + todaySteps);

        if (todaySteps > yesterdaySteps) {
            System.out.println("Есть прогресс!");
        } else if (todaySteps < yesterdaySteps) {
            System.out.println("Прогресс снизился.");
        } else {
            System.out.println("Прогресс без изменений.");
        }

        double averageSteps = (yesterdaySteps + todaySteps) / 2.0;
        System.out.println("Среднее значение шагов: " + averageSteps);

        System.out.println("\n3. ПРОВЕРКА КОЛИЧЕСТВА ГОСТЕЙ\n");

        int guests = 10;

        if (guests < 0) {
            System.out.println("Ошибка: количество гостей не может быть отрицательным.");
        } else if (guests == 0) {
            System.out.println("Пока никто не записался на мероприятие!");
        } else if (guests % 2 == 0) {
            System.out.println("Записалось " + guests + " гостей. Можно формировать пары для конкурсов.");
        } else {
            System.out.println("Записалось " + guests + " гостей. Нужны индивидуальные задания.");
        }

        System.out.println("\n4. ОПРЕДЕЛЕНИЕ ПЕРВОГО СИМВОЛА НИКНЕЙМА\n");

        String nickname = "Matrix";
        String message = "Имя " + nickname + " начинается с ";
        char firstChar = nickname.charAt(0);

        if (firstChar >= 'a' && firstChar <= 'z') {
            System.out.println(message + "маленькой буквы '" + firstChar + "'");
        } else if (firstChar >= 'A' && firstChar <= 'Z') {
            System.out.println(message + "большой буквы '" + firstChar + "'");
        } else if (firstChar >= '0' && firstChar <= '9') {
            System.out.println(message + "цифры '" + firstChar + "'");
        } else {
            System.out.println(message + "символа '" + firstChar + "'");
        }

        nickname = "@" + nickname;
        message = "Имя " + nickname + " начинается с ";
        firstChar = nickname.charAt(0);

        if (Character.isLowerCase(firstChar)) {
            System.out.println(message + "маленькой буквы '" + firstChar + "'");
        } else if (Character.isUpperCase(firstChar)) {
            System.out.println(message + "большой буквы '" + firstChar + "'");
        } else if (Character.isDigit(firstChar)) {
            System.out.println(message + "цифры '" + firstChar + "'");
        } else {
            System.out.println(message + "символа '" + firstChar + "'");
        }

        System.out.println("\n5. ИНВЕНТАРИЗАЦИЯ\n");

        int dbSerialNumber = 567;
        int pcSerialNumber = 127;

        if (dbSerialNumber == pcSerialNumber) {
            int floor = pcSerialNumber / 100;
            int room = pcSerialNumber % 100;
            
            System.out.println("[№" + pcSerialNumber +
                    "]: компьютер на " + floor +
                    "-м этаже в кабинете " + room);
        } else {
            int dbHundreds = dbSerialNumber / 100;
            int dbTens = dbSerialNumber / 10 % 10;
            int dbOnes = dbSerialNumber % 10;

            int pcHundreds = pcSerialNumber / 100;
            int pcTens = pcSerialNumber / 10 % 10;
            int pcOnes = pcSerialNumber % 10;

            if (dbHundreds != pcHundreds && dbTens != pcTens && dbOnes != pcOnes) {
                System.out.println("[№" + pcSerialNumber + "]: оборудование не идентифицировано");
            } else {
                String hundreds = dbHundreds == pcHundreds ? String.valueOf(pcHundreds) : "_";
                String tens = dbTens == pcTens ? String.valueOf(pcTens) : "_";
                String ones = dbOnes == pcOnes ? String.valueOf(pcOnes) : "_";

                System.out.printf("""
                        Нет полного совпадения:
                        База данных: [№%d]
                        Фактический: [№%s%s%s]
                        """, dbSerialNumber, hundreds, tens, ones);
            }
        }

        System.out.println("\n6. ПОДСЧЕТ НАЧИСЛЕННЫХ БАНКОМ %\n");

        float deposit = 321123.79f;
        float rate;

        if (deposit < 100000) {
            rate = 0.05f;
        } else if (deposit <= 300000) {
            rate = 0.07f;
        } else {
            rate = 0.10f;
        }

        float interest = deposit * rate;
        float total = deposit + interest;

        System.out.println("Сумма вклада: " + deposit + " руб.");
        System.out.println("Сумма начисленного %: " + interest + " руб.");
        System.out.println("Итоговая сумма c %: " + total + " руб.\n");

        BigDecimal depositBd = BigDecimal.valueOf(321123.79);
        BigDecimal rateBd;

        if (depositBd.compareTo(BigDecimal.valueOf(100000)) < 0) {
            rateBd = BigDecimal.valueOf(0.05);
        } else if (depositBd.compareTo(BigDecimal.valueOf(300000)) <= 0) {
            rateBd = BigDecimal.valueOf(0.07);
        } else {
            rateBd = BigDecimal.valueOf(0.10);
        }

        BigDecimal interestBd = depositBd.multiply(rateBd).setScale(2, RoundingMode.HALF_UP);
        BigDecimal totalBd = depositBd.add(interestBd);

        System.out.println("Сумма вклада: " + depositBd + " руб.");
        System.out.println("Сумма начисленного %: " + interestBd + " руб.");
        System.out.println("Итоговая сумма c %: " + totalBd + " руб.");

        System.out.println("\n7. ОПРЕДЕЛЕНИЕ ОЦЕНКИ ПО ПРЕДМЕТАМ\n");

        int historyPercent = 59;
        int programmingPercent = 92;

        int historyGrade;
        int programmingGrade;

        if (historyPercent <= 60) {
            historyGrade = 2;
        } else if (historyPercent <= 73) {
            historyGrade = 3;
        } else if (historyPercent <= 91) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }

        if (programmingPercent <= 60) {
            programmingGrade = 2;
        } else if (programmingPercent <= 73) {
            programmingGrade = 3;
        } else if (programmingPercent <= 91) {
            programmingGrade = 4;
        } else {
            programmingGrade = 5;
        }

        System.out.println("История: " + historyGrade);
        System.out.println("Программирование: " + programmingGrade);

        double averageGrade = (historyGrade + programmingGrade) / 2.0;
        double averagePercent = (historyPercent + programmingPercent) / 2.0;

        System.out.println("Средний балл оценок по предметам: " + averageGrade);
        System.out.println("Средний % по предметам: " + averagePercent);

        System.out.println("\n8. РАСЧЕТ ГОДОВОЙ ПРИБЫЛИ\n");

        BigDecimal sales = BigDecimal.valueOf(13025.233);
        BigDecimal rentCost = BigDecimal.valueOf(5123.018);
        BigDecimal productionCost = BigDecimal.valueOf(9001.729);

        BigDecimal monthlyProfit = sales
                .subtract(rentCost)
                .subtract(productionCost);

        BigDecimal annualProfit = monthlyProfit
                .multiply(BigDecimal.valueOf(12))
                .setScale(2, RoundingMode.HALF_UP);

        String sign = "";
        if (annualProfit.compareTo(BigDecimal.ZERO) > 0) {
            sign = "+";
        }

        System.out.println("Прибыль за год: " + sign + annualProfit + " руб.");
    }
}