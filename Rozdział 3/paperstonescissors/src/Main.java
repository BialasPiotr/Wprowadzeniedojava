import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gra w papier, kamień, nożyce");
        System.out.println("0 - Nożyce");
        System.out.println("1 - Kamień");
        System.out.println("2 - Papier");

        System.out.print("Wybierz liczbę (0, 1 lub 2): ");
        int userChoice = scanner.nextInt();

        if (userChoice < 0 || userChoice > 2) {
            System.out.println("Nieprawidłowy wybór!");
            return;
        }

        int computerChoice = (int) (Math.random() * 3);

        System.out.println("Komputer wybrał: " + computerChoice);

        if (userChoice == computerChoice) {
            System.out.println("Remis!");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                (userChoice == 1 && computerChoice == 0) ||
                (userChoice == 2 && computerChoice == 1)) {
            System.out.println("Wygrałeś!");
        } else {
            System.out.println("Komputer wygrał!");
        }
    }
}
