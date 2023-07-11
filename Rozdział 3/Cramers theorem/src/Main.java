import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj a, b, c, d, e i f: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        double determinant = a * d - b * c;

        if (determinant == 0) {
            System.out.println("Równanie nie ma rozwiązania.");
        } else {
            double x = (e * d - b * f) / determinant;
            double y = (a * f - e * c) / determinant;
            System.out.println("Wynik:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }

    }
}