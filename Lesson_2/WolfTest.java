public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setGender("Male");
        wolf.setName("Akela");
        wolf.setWeight(45.7);
        wolf.setAge(4);
        wolf.setColor("Gray");

        System.out.println("Пол: " + wolf.getGender());
        System.out.println("Кличка: " + wolf.getName());
        System.out.println("Вес: " + wolf.getWeight());
        System.out.println("Возраст: " + wolf.getAge());
        System.out.println("Окрас: " + wolf.getColor());

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}