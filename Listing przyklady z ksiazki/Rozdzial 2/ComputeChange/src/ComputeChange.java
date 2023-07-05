import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        // Tworzenie obiektu typu Scanner
        Scanner input = new Scanner(System.in);

        // Pobieranie kwoty pieniędzy
        System.out.print("Podaj kwotę jako wartość typu double (na przykład 11.56): ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        // Ustalanie liczby dolarów
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        // Ustalanie liczby ćwierćdolarówek w pozostałej kwocie
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        // Ustalanie liczby dziesięciocentówek w pozostałej kwocie
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        // Ustalanie liczby pięciocentówek w pozostałej kwocie
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        // Ustalanie liczby centówek w pozostałej kwocie
        int numberOfPennies = remainingAmount;

        // Wyświetlanie wyników
        System.out.println("Kwota " + amount + " zawiera:");
        System.out.println(" dolary - " + numberOfOneDollars);
        System.out.println(" ćwierćdolarówki - " + numberOfQuarters);
        System.out.println(" dziesięciocentówki - " + numberOfDimes);
        System.out.println(" pięciocentówki - " + numberOfNickels);
        System.out.println(" centówki - " + numberOfPennies);
    }
}
