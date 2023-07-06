import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        int lottery = (int)(Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.print("Wytypuj liczbę (dwie cyfry): ");
        int guess = input.nextInt();

        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("Wygenerowana liczba to " + lottery);

        if (guess == lottery)
            System.out.println("Pełne dopasowanie — wygrałeś 10 000 zł");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
            System.out.println("Dopasowanie obu cyfr - wygrałeś 3000 zł");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 ||
                guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
            System.out.println("Dopasowanie jednej cyfry — wygrałeś 1000 zł");
        else
            System.out.println("Niestety, brak dopasowania");
    }
}
