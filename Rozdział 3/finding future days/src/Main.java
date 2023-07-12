import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj numer dnia tygodnia: ");
        int currentDay = input.nextInt();
        System.out.println("Podaj liczbę dni do jakiejś przyszłej daty: ");
        int futureday = input.nextInt();

        int future = (currentDay + futureday) % 7;

        String day = getDay(currentDay);

        System.out.println("Dziś jest " + day + ", a wskazany przyszły dzień to " + getDay(future));
    }

    public static String getDay(int day) {
        String dayName;

        switch (day) {
            case 1:
                dayName = "poniedziałek";
                break;
            case 2:
                dayName = "wtorek";
                break;
            case 3:
                dayName = "środa";
                break;
            case 4:
                dayName = "czwartek";
                break;
            case 5:
                dayName = "piątek";
                break;
            case 6:
                dayName = "sobota";
                break;
            case 0:
                dayName = "niedziela";
                break;
            default:
                dayName = "Nieprawidłowy numer dnia tygodnia";
        }

        return dayName;
    }
}
