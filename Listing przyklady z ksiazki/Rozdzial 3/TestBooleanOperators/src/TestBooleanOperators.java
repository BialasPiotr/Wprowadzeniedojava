import java.util.Scanner;

public class TestBooleanOperators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj liczbę całkowitą: ");
        int number = input.nextInt();

        if (number % 2 == 0 && number % 3 == 0)
            System.out.println("Liczba " + number + " jest podzielna przez 2 i 3.");

        if (number % 2 == 0 || number % 3 == 0)
            System.out.println("Liczba " + number + " jest podzielna przez 2 lub 3.");

        if (number % 2 == 0 ^ number % 3 == 0)
            System.out.println("Liczba " + number + " jest podzielna przez 2 lub 3, ale nie przez obie jednocześnie.");
    }
}
