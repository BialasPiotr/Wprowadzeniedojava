import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj a, b i c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double wyróżnik = b * b - 4 * a * c;

        if (wyróżnik > 0) {
            double x1 = (-b + Math.sqrt(wyróżnik)) / (2 * a);
            double x2 = (-b - Math.sqrt(wyróżnik)) / (2 * a);
            System.out.println("Równanie ma dwa pierwiastki: " + x1 + " i " + x2);
        } else if (wyróżnik == 0) {
            double x = -b / (2 * a);
            System.out.println("Równanie ma jeden pierwiastek: " + x);
        } else {
            System.out.println("Równanie nie ma pierwiastków rzeczywistych");
        }
    }
}
