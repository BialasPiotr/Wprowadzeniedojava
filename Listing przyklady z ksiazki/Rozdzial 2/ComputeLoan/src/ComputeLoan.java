import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        // Tworzenie obiektu typu Scanner
        Scanner input = new Scanner(System.in);

        // Podawanie rocznej stopy oprocentowania w procentach, na przykład 7.25
        System.out.print("Podaj roczną stopę oprocentowania, na przykład 7.25: ");
        double annualInterestRate = input.nextDouble();

        // Obliczanie miesięcznej stopy oprocentowania
        double monthlyInterestRate = annualInterestRate / 1200;

        // Podawanie liczby lat
        System.out.print("Podaj liczbę lat jako liczbę całkowitą, na przykład 5: ");
        int numberOfYears = input.nextInt();

        // Podawanie kwoty kredytu
        System.out.print("Podaj kwotę kredytu, na przykład 120000.95: ");
        double loanAmount = input.nextDouble();

        // Obliczanie rat
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        // Wyświetlanie wyników
        System.out.println("Miesięczna rata wynosi " + (int) (monthlyPayment * 100) / 100.0);
        System.out.println("Łączna kwota do spłaty wynosi " + (int) (totalPayment * 100) / 100.0);
    }
}
