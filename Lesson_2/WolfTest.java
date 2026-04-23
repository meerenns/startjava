public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();

        wolf.setGender("Male");
        wolf.setName("Akela");
        wolf.setColor("Gray");
        wolf.setWeight(45.7);
        wolf.setAge(4);

        System.out.println("Пол: " + wolf.getGender());
        System.out.println("Кличка: " + wolf.getName());
        System.out.println("Окрас: " + wolf.getColor());
        System.out.println("Вес: " + wolf.getWeight());
        System.out.println("Возраст: " + wolf.getAge());

        wolf.walk();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}