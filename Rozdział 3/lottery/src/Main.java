import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int lottery = (int)(Math.random() * 900) + 100;

        Scanner input = new Scanner(System.in);
        System.out.print("Wytypuj trzycyfrową liczbę całkowitą: ");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery / 100;
        int lotteryDigit2 = (lottery / 10) % 10;
        int lotteryDigit3 = lottery % 10;

        int guessDigit1 = guess / 100;
        int guessDigit2 = (guess / 10) % 10;
        int guessDigit3 = guess % 10;

        System.out.println("Wygenerowana liczba to " + lottery);

        if (guess == lottery) {
            System.out.println("Pełne dopasowanie — wygrałeś 10 000 zł");
        } else if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2 && guessDigit3 == lotteryDigit3) {
            System.out.println("Dopasowanie wszystkich cyfr - wygrałeś 3000 zł");
        } else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit1 == lotteryDigit3 ||
                guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2 || guessDigit2 == lotteryDigit3 ||
                guessDigit3 == lotteryDigit1 || guessDigit3 == lotteryDigit2 || guessDigit3 == lotteryDigit3) {
            System.out.println("Dopasowanie przynajmniej jednej cyfry — wygrałeś 1000 zł");
        } else {
            System.out.println("Niestety, brak dopasowania");
        }
    }
}
