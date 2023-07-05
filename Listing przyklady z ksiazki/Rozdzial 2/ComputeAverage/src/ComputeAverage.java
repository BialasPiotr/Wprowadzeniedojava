import java.util.Scanner; // Klasa Scanner znajduje się w pakiecie java.util

public class ComputeAverage {
    public static void main(String[] args) {
        // Tworzenie obiektu typu Scanner
        Scanner input = new Scanner(System.in);

        // Prośba do użytkownika o wpisanie trzech liczb
        System.out.print("Podaj trzy liczby: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // Obliczanie średniej
        double average = (number1 + number2 + number3) / 3;

        // Wyświetlanie wyników
        System.out.println("Średnia liczb " + number1 + ", " + number2
                + " i " + number3 + " wynosi " + average);
    }
}
