import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int wynik = random.nextInt(2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Odgadnij wynik rzutu monetą: 0 to orzeł a 1 to reszka");
        int losowy = scanner.nextInt();

        if (losowy == wynik) {
            System.out.println("Gratulacje! Twoja odpowiedź jest poprawna.");
        } else {
            System.out.println("Niestety, Twoja odpowiedź jest niepoprawna.");
        }
    }
}
