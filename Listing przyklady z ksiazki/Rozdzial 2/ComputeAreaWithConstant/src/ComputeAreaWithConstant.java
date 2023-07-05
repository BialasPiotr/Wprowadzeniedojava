import java.util.Scanner; // Klasa Scanner znajduje się w pakiecie java.util

public class ComputeAreaWithConstant {
    public static void main(String[] args) {
        final double PI = 3.14159; // Deklarowanie stałej

        // Tworzenie obiektu typu Scanner
        Scanner input = new Scanner(System.in);

        // Wyświetlanie użytkownikowi prośby o podanie promienia
        System.out.print("Podaj promień: ");
        double radius = input.nextDouble();

        // Obliczanie powierzchni
        double area = radius * radius * PI;

        // Wyświetlanie wyników
        System.out.println("Powierzchnia koła o promieniu " +
                radius + " wynosi " + area);
    }
}
