import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj kwotę jako wartość typu double (na przykład 11.56): ");
        double amount = input.nextDouble();

        int remainingAmount = (int) (amount * 100);

        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Kwota " + amount + " zawiera:");

        if (numberOfOneDollars > 0) {
            String format = (numberOfOneDollars == 1) ? "Dolar: " : "Dolary: ";
            System.out.println(format + numberOfOneDollars);
        }

        if (numberOfQuarters > 0) {
            String format = (numberOfQuarters == 1) ? "Ćwierćdolarówka: " : "Ćwierćdolarówki: ";
            System.out.println(format + numberOfQuarters);
        }

        if (numberOfDimes > 0) {
            String format = (numberOfDimes == 1) ? "Dziesięciocentówka: " : "Dziesięciocentówki: ";
            System.out.println(format + numberOfDimes);
        }

        if (numberOfNickels > 0) {
            String format = (numberOfNickels == 1) ? "Pięciocentówka: " : "Pięciocentówki: ";
            System.out.println(format + numberOfNickels);
        }

        if (numberOfPennies > 0) {
            String format = (numberOfPennies == 1) ? "Centówka: " : "Centówki: ";
            System.out.println(format + numberOfPennies);
        }
    }
}
