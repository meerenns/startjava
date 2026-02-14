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

        System.out.println("2. РАСЧЕТ СТОИМОСТИ ТОВАРА");
        
        System.out.println("3. ПЕРЕСТАНОВКА ЗНАЧЕНИЙ ЯЧЕЕК В ТАБЛИЦЕ");
        System.out.println("4. ДЕКОДИРОВАНИЕ СООБЩЕНИЯ");
        System.out.println("5. АНАЛИЗ КОДА ТОВАРА");
        System.out.println("6. ТЕСТИРОВАНИЕ ДАТЧИКОВ ПЕРЕД ЗАПУСКОМ РАКЕТЫ");
        System.out.println("7. ВЫВОД ПАРАМЕТРОВ JVM И ОС");
        System.out.println("8. ЗАМЕР ВРЕМЕНИ РАБОТЫ КОДА");
    }
}