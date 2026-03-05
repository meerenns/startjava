import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. ВЫВОД ASCII-ГРАФИКИ\n");

        String javaWordJoin = String.join("\n",
                "                     /\\",
                "   J    a  v     v  /  \\",
                "   J   a a  v   v  /_( )\\",
                "J  J  aaaaa  V V  /      \\",
                " JJ  a     a  V  /___/\\___\\"
        );
        System.out.println(javaWordJoin + "\n");

        String javaWordBlock = """
                         /\\
                   J    /  \\  v     v  a
                   J   /_( )\\  v   v  a a
                J  J  /      \\  V V  aaaaa
                 JJ  /___/\\___\\  V  a     a
                """;
        System.out.println(javaWordBlock + "\n");

        System.out.println("2. РАСЧЕТ СТОИМОСТИ ТОВАРА\n");

        float penPrice = 105.5f;
        float bookPrice = 235.23f;
        float discountPercent = 11f;
        float totalPrice = penPrice + bookPrice;
        float discountAmount = totalPrice * discountPercent / 100;
        float finalPrice = totalPrice - discountAmount;

        System.out.println("Стоимость товаров без скидки = " + totalPrice);
        System.out.println("Сумма скидки = " + discountAmount);
        System.out.println("Стоимость товаров со скидкой = " + finalPrice + "\n");

        var penPriceBd = BigDecimal.valueOf(105.50);
        var bookPriceBd = BigDecimal.valueOf(235.23);
        var discountPercentBd = BigDecimal.valueOf(11);
        var totalPriceBd = penPriceBd.add(bookPriceBd);

        var discountAmountBd = totalPriceBd
                .multiply(discountPercentBd)
                .divide(BigDecimal.valueOf(100))
                .setScale(2, RoundingMode.HALF_UP);

        var finalPriceBd = totalPriceBd
                .subtract(discountAmountBd)
                .setScale(2, RoundingMode.HALF_UP);

        System.out.println("Стоимость товаров без скидки = " + totalPriceBd);
        System.out.println("Сумма скидки = " + discountAmountBd);
        System.out.println("Стоимость товаров со скидкой = " + finalPriceBd);

        System.out.println("\n3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ\n");

        int a1 = 2;
        int b1 = 5;
        System.out.println("Исходные значения: A1 = " + a1 + ", B1 = " + b1 + "\n");

        System.out.println("Метод: третья переменная");
        int c1 = a1;
        a1 = b1;
        b1 = c1;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1 + "\n");
        
        System.out.println("Метод: арифметический");
        a1 -= b1;
        b1 += a1;
        a1 = b1 - a1;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1 + "\n");

        System.out.println("Метод: побитовый");
        a1 ^= b1;
        b1 ^= a1;
        a1 ^= b1;
        System.out.println("Результат: A1 = " + a1 + ", B1 = " + b1 + "\n");

        System.out.println("4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ\n");

        int code1 = 1055;
        int code2 = 1088;
        int code3 = 1080;
        int code4 = 1074;
        int code5 = 1077;
        int code6 = 1090;
        System.out.printf("%6d %6d %6d %6d %6d %6d%n", code1, code2, code3, code4, code5, code6);
        System.out.printf("%6c %6c %6c %6c %6c %6c%n",
                (char) code1,
                (char) code2,
                (char) code3,
                (char) code4,
                (char) code5,
                (char) code6);

        System.out.println("\n5. АНАЛИЗ КОДА ТОВАРА\n");

        int productCode = 123;
        int productCategory = productCode / 100;
        int subcategory = productCode / 10 % 10;
        int packageType = productCode % 10;
        int checksum = productCategory + subcategory + packageType;
        int verificationCode = productCategory * subcategory * packageType;
        System.out.printf("""
            Код товара: %d
              категория товара - %d
              подкатегория - %d
              тип упаковки - %d
            Контрольная сумма = %d
            Проверочный код = %d
                """, productCode, productCategory, subcategory, packageType, checksum, verificationCode);

        System.out.println("\n6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ\n");

        byte temperature = Byte.MAX_VALUE;
        System.out.printf("""
            [Температура, °C]:
                Исходное: %d
                +1: %d
                -1: %d
                    """,
                temperature,
                ++temperature,
                --temperature);
        short pressure = Short.MAX_VALUE;
        System.out.printf("""
            [Давление, Па]:
                Исходное: %d
                +1: %d
                -1: %d
                    """,
                pressure,
                ++pressure,
                --pressure);
        char systemStatusCode = Character.MAX_VALUE;
        System.out.printf("""
            [Код состояния системы]:
                Исходное: %d
                +1: %d
                -1: %d
                    """,
                (int) systemStatusCode,
                (int) (++systemStatusCode),
                (int) (--systemStatusCode));
        int travelDistance = Integer.MAX_VALUE;
        System.out.printf("""
            [Пройденное расстояние, км]:
                Исходное: %d
                +1: %d
                -1: %d
                    """,
                travelDistance,
                ++travelDistance,
                --travelDistance);
        long launchTime = Long.MAX_VALUE;
        System.out.printf("""
            [время с момента старта, с]:
                Исходное: %d
                +1: %d
                -1: %d
                    """,
                launchTime,
                ++launchTime,
                --launchTime);

        System.out.println("\n7. ВЫВОД ПАРАМЕТРОВ JVM И ОС\n");

        Runtime runtime = Runtime.getRuntime();

        double totalMemory = runtime.totalMemory() / 1024.0 / 1024.0;
        double freeMemory = runtime.freeMemory() / 1024.0 / 1024.0;
        double maxMemory = runtime.maxMemory() / 1024.0 / 1024.0;
        double usedMemory = totalMemory - freeMemory;

        System.out.printf("""
            [JVM характеристики]
            Доступное число ядер: %d
            Выделенная память: %.1f Мб
            Свободная память: %.1f Мб
            Используемая память: %.1f Мб
            Максимально доступная для выделения память: %.1f Мб
                """,
                runtime.availableProcessors(),
                totalMemory,
                freeMemory,
                usedMemory,
                maxMemory
        );

        System.out.printf("\n" + """
            [Параметры ОС]
            Системный диск: %s
            Версия ОС: %s
            Версия Java: %s
            Символ разделения пути (сепаратор): %s
                """,
                System.getProperty("user.dir").substring(0, 1),
                System.getProperty("os.version"),
                System.getProperty("java.version"),
                System.getProperty("file.separator")
        );

        System.out.println("\n8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА\n");

        long start = System.nanoTime();
        LocalTime startTime = LocalTime.now();

        long finish = System.nanoTime();
        LocalTime finishTime = LocalTime.now();

        long duration = finish - start;
        double seconds = duration / 1_000_000_000.0;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

        System.out.printf("""
            | Старт проверки | %s |
            +----------------+-------------+
            | Финиш проверки | %s |
            +----------------+-------------+
            | Время работы   | %.3f сек    |
                """,
                startTime.format(formatter),
                finishTime.format(formatter),
                seconds
        );
    }
}