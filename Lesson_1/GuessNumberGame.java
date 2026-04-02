import java.util.Random;

public class GuessNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        int luckyNumber = random.nextInt(1, 101);

        int left = 1;
        int right = 100;
        int guess;

        while (true) {
            guess = (left + right) / 2;
            if (guess > luckyNumber) {
                System.out.println(guess + " больше того, что загадал компьютер");
                right = guess - 1;
            } else if (guess < luckyNumber) {
                System.out.println(guess + " меньше того, что загадал компьютер");
                left = guess + 1;
            } else {
                System.out.println("Вы победили!");
                break;
            }
        }
    }
}