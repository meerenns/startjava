public class JaegerTest {
    public static void main(String[] args) {
        Jaeger gipsy = new Jaeger();

        gipsy.setModelName("Gipsy Danger");
        gipsy.setMark("Mark-3");
        gipsy.setOrigin("USA");
        gipsy.setHeight(79.25f);
        gipsy.setWeight(1980f);
        gipsy.setStrength(8);
        gipsy.setArmor(6);

        System.out.println("Gipsy Danger:");
        System.out.println("Модель: " + gipsy.getModelName());
        System.out.println("Mark: " + gipsy.getMark());
        System.out.println("Страна: " + gipsy.getOrigin());
        System.out.println("Высота: " + gipsy.getHeight());
        System.out.println("Вес: " + gipsy.getWeight());
        System.out.println("Сила: " + gipsy.getStrength());
        System.out.println("Броня: " + gipsy.getArmor());

        gipsy.drift();
        gipsy.move();
        gipsy.scanKaiju();

        System.out.println();

        Jaeger coyote = new Jaeger(
                "Coyote Tango",
                "Mark-1",
                "Japan",
                85.34f,
                2312f,
                7,
                4
        );

        System.out.println("Coyote Tango:");
        System.out.println("Модель: " + coyote.getModelName());
        System.out.println("Mark: " + coyote.getMark());
        System.out.println("Страна: " + coyote.getOrigin());
        System.out.println("Высота: " + coyote.getHeight());
        System.out.println("Вес: " + coyote.getWeight());
        System.out.println("Сила: " + coyote.getStrength());
        System.out.println("Броня: " + coyote.getArmor());

        coyote.drift();
        coyote.move();
        coyote.scanKaiju();
    }
}