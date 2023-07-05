import java.util.Scanner; // Klasa Scanner znajduje się w pakiecie java.util

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args) {
        // Tworzenie obiektu typu Scanner
        Scanner input = new Scanner(System.in);

        // Prośba do użytkownika o podanie promienia
        System.out.print("Podaj promień: ");
        double radius = input.nextDouble();

        // Obliczanie powierzchni
        double area = radius * radius * 3.14159;

        // Wyświetlanie wyników
        System.out.println("Powierzchnia koła o promieniu " +
                radius + " wynosi " + area);
    }
}
