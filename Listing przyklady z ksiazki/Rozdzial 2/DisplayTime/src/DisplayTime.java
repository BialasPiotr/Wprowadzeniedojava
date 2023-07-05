import java.util.Scanner;

public class DisplayTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prośba do użytkownika o dane wejściowe:
        System.out.print("Podaj liczbę sekund (jako liczbę całkowitą): ");
        int seconds = input.nextInt();

        int minutes = seconds / 60; // Liczba minut
        int remainingSeconds = seconds % 60; // Pozostałe sekundy
        System.out.println(seconds + " sekund to " + minutes +
                " minut i " + remainingSeconds + " sekund");
    }
}
