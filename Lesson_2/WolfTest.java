public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.gender = "Male";
        wolf.name = "Akela";
        wolf.weight = 45.7;
        wolf.age = 4;
        wolf.color = "Gray";

        System.out.println("Пол: " + wolf.gender);
        System.out.println("Кличка: " + wolf.name);
        System.out.println("Вес: " + wolf.weight);
        System.out.println("Возраст: " + wolf.age);
        System.out.println("Окрас: " + wolf.color);

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}