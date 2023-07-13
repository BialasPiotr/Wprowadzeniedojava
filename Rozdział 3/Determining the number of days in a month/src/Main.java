import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Proszę podaj numer miesiąca i rok: ");
        int miesiac = input.nextInt();
        int rok = input.nextInt();

        String nazwaMiesiaca;

        switch (miesiac) {
            case 1:
                nazwaMiesiaca = "styczeń";
                break;
            case 2:
                nazwaMiesiaca = "luty";
                break;
            case 3:
                nazwaMiesiaca = "marzec";
                break;
            case 4:
                nazwaMiesiaca = "kwiecień";
                break;
            case 5:
                nazwaMiesiaca = "maj";
                break;
            case 6:
                nazwaMiesiaca = "czerwiec";
                break;
            case 7:
                nazwaMiesiaca = "lipiec";
                break;
            case 8:
                nazwaMiesiaca = "sierpień";
                break;
            case 9:
                nazwaMiesiaca = "wrzesień";
                break;
            case 10:
                nazwaMiesiaca = "październik";
                break;
            case 11:
                nazwaMiesiaca = "listopad";
                break;
            case 12:
                nazwaMiesiaca = "grudzień";
                break;
            default:
                nazwaMiesiaca = "Nieprawidłowy numer miesiąca";
                break;
        }

        if (miesiac >= 1 && miesiac <= 12) {
            int liczbaDni;

            if (miesiac == 2) {
                if ((rok % 4 == 0 && rok % 100 != 0) || rok % 400 == 0) {
                    liczbaDni = 29;
                } else {
                    liczbaDni = 28;
                }
            } else if (miesiac == 4 || miesiac == 6 || miesiac == 9 || miesiac == 11) {
                liczbaDni = 30;
            } else {
                liczbaDni = 31;
            }

            System.out.println(nazwaMiesiaca + " w " + rok + " roku ma " + liczbaDni + " dni.");
        } else {
            System.out.println(nazwaMiesiaca);
        }
    }
}
