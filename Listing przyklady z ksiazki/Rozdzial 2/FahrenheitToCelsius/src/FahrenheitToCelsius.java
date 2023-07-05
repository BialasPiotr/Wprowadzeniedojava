import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj temperaturę w stopniach Fahrenheita: ");
        double fahrenheit = input.nextDouble();

        // Przeliczanie stopni Fahrenheita na stopnie Celsjusza
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("W stopniach Fahrenheita: " + fahrenheit +
                ", w stopniach Celsjusza: " + celsius);
    }
}
