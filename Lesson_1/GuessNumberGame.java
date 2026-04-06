import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNum = random.nextInt(1, 101);

        int left = 1;
        int right = 100;
        int guess = (left + right) / 2;

        while (guess != secretNum) {
            if (guess > secretNum) {
                System.out.println(guess + " больше того, что загадал компьютер");
                right = guess - 1;
            } else if (guess < secretNum) {
                System.out.println(guess + " меньше того, что загадал компьютер");
                left = guess + 1;
            }

            guess = (left + right) / 2;
        }

        System.out.println("Вы победили!");
    }
}