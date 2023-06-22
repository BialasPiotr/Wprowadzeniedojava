import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//2.1
       /* System.out.println("Podaj temperature w stopniach Celsjusza: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.println("Stopnie Celsjusza: " + celsius + ", Stopnie Fahrenheita: " + fahrenheit);

        Walec();
        Stopa();
        Funt();
        Napiwek();
        Sumowanie();
        Fizyka();
        wiek();*/
        Czas();
    }
    //2.2
    public static void Walec(){
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj promien i wysokosc walca: " );
        double promien = input.nextDouble();
        double wysokosc = input.nextDouble();
        double podstawa = promien * promien * Math.PI;
        double objetosc = podstawa * wysokosc;

        System.out.println("Powierzchnia podstawy wynosi: " + podstawa);
        System.out.println("Objetosc wynosi:  " + objetosc);




    }
//2.3
    public static void Stopa(){
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj wartosc w stopach: ");
        double stopa = input.nextDouble();
        double metr = stopa * 0.305;
        System.out.println(+ stopa + " w stopach wynosi " + metr + " w metrach");

    }
    //2.4
    public static void Funt(){
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj wartosc w funtach: ");
        double funt = input.nextDouble();
        double kilogram = funt * 0.454;
        System.out.println(+ funt + " w funtach to " + kilogram + " w kilogramach");

    }
    //2.5
    public static void Napiwek(){
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj cene posiliku i procent napiwku: ");
        double cena = input.nextDouble();
        double procent = input.nextDouble();
        double napiwek = (procent / 100) * cena;
        double razem = cena + napiwek;
        System.out.println("Wysokosc napiwku to: " + napiwek + " zl, do zaplaty " + razem );

    }
    //2.6
    public static void Sumowanie(){
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj liczbę z przedziału od 0 do 1000: ");
        int liczba = input.nextInt();
        int suma = 0;

        while (liczba != 0) {
            int cyfra = liczba % 10;
            suma += cyfra;
            liczba /= 10;
        }

        System.out.println("Suma cyfr wynosi " + suma);
    }

    //2.7
    public static void Fizyka(){
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj v0, v1 i t: ");
        double v0 = input.nextDouble();
        double v1 = input.nextDouble();
        double t = input.nextDouble();
        double suma = (v1 - v0) / t;
        System.out.println("Srednie przeszypieszenie wynosi: " + suma);
    }
    //2.8
    public static void wiek(){
        Scanner input = new Scanner(System.in);

        System.out.println("podaj liczbe minut: ");
        int minuty = input.nextInt();
        int dni = minuty / 1440;
        int lata = dni / 365;
        int resztadni = dni % 365;
        System.out.println(minuty + " minut to w przyblizeniu " + lata + " lata i " + resztadni + " dni");
    }
    //2.9
    public static void Czas(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj różnicę względem strefy GMT: ");
        int timeDifference = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + timeDifference) % 24;

        System.out.println("Aktualny czas w podanej strefie to: " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }

    }