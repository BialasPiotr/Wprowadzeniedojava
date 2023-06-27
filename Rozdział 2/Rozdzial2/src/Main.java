import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//2.1
        System.out.println("Podaj temperature w stopniach Celsjusza: ");
        double celsius = input.nextDouble();
        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        System.out.println("Stopnie Celsjusza: " + celsius + ", Stopnie Fahrenheita: " + fahrenheit);

        Walec();
        Stopa();
        Funt();
        Napiwek();
        Sumowanie();
        Fizyka();
        wiek();
        Czas();
        Nauka();
        Fiz();
        AplikacjaFinansowa();
        Zdrowie();
        Geometria();
        Szescian();
        odczuwalna();
        Tabela();
        Inwestycja();
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
    //2.10

    public static void Nauka(){
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj mase wody w kilogramach: ");
        double kilo = input.nextDouble();

        System.out.println("Podaj poczatkowa tempretaure ");
        double tempfirst = input.nextDouble();

        System.out.println("Podaj koncowa temperature ");
        double templast = input.nextDouble();

        double energia = kilo * (templast - tempfirst)  * 4184;
        System.out.println("Potrzebna ilosc energii to: " + energia);


    }

    //2.12
    public static void Fiz(){
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj predkosc startu i przyszpieszenie: ");
        double predkosc = input.nextDouble();
        double przyszpieszenie = input.nextDouble();
        double dlugosc = Math.pow(predkosc, 2) / (przyszpieszenie * 2 );
        System.out.print("Minimalna dlugosc pasa startowego dla tego samolotu wynosi: " + dlugosc);



    }
    //2.13
    public static void AplikacjaFinansowa(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj kwotę miesięcznych oszczędności: ");
        double oszczednosci = scanner.nextDouble();

        double zwieksza = 0.05;
        double zwiekszeniemiesieczne = zwieksza / 12;
        double stankonta = 0;

        for (int i = 1; i <= 6; i++) {
            stankonta = (stankonta + oszczednosci) * (1 +  zwiekszeniemiesieczne);
        }

        System.out.println("Stan konta po sześciu miesiącach: " + stankonta);
    }
    //2.14
    public static void Zdrowie() {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj wagę w funtach: ");
        double wagaFunt = input.nextDouble();

        System.out.print("Podaj wzrost w calach: ");
        double wzrostCal = input.nextDouble();

        double wagaKg = wagaFunt * 0.45359237;
        double wzrostM = wzrostCal * 0.0254;

        double bmi = wagaKg / (wzrostM * wzrostM);

        System.out.println("Wskaźnik BMI wynosi: " + bmi);
    }
    //2.15
  public static void Geometria(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj x1 i y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("Podaj x2 i y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double odleglosc = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);

        System.out.println("Odległość między dwoma podanymi punktami wynosi: " + odleglosc);
    }
//2.16
    public static void Szescian(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj długość boku: ");
        double dlugoscBoku = scanner.nextDouble();

        double powierzchnia = (3 * Math.sqrt(3) * Math.pow(dlugoscBoku, 2)) / 2;

        System.out.println("Powierzchnia sześciokąta wynosi: " + powierzchnia);
    }
    //2.17
    public static void odczuwalna(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj temperaturę z przedziału od -50 do 5 stopni Celsjusza: ");
        double temperatura = scanner.nextDouble();

        System.out.print("Podaj prędkość wiatru (>= 3.2) w km/h: ");
        double predkoscWiatru = scanner.nextDouble();

        if (temperatura >= -50 && temperatura <= 5 && predkoscWiatru >= 3.2) {
            double temperaturaOdczuwalna = 13.12 + 0.6215 * temperatura - 11.37 * Math.pow(predkoscWiatru, 0.16)
                    + 0.3965 * temperatura * Math.pow(predkoscWiatru, 0.16);
            System.out.println("Temperatura odczuwalna wynosi: " + temperaturaOdczuwalna);
        } else {
            System.out.println("Podane wartości nie spełniają warunków.");
        }
    }
    //2.18
    public static void Tabela(){
        System.out.println("a\tb\tpow(a, b)");
        System.out.println("----------------");
        System.out.println("1\t2\t" + (int) Math.pow(1, 2));
        System.out.println("2\t3\t" + (int) Math.pow(2, 3));
        System.out.println("3\t4\t" + (int) Math.pow(3, 4));
        System.out.println("4\t5\t" + (int) Math.pow(4, 5));
        System.out.println("5\t6\t" + (int) Math.pow(5, 6));
    }
    //2.21
    public static void Inwestycja(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj kwotę inwestycji: ");
        double kwotaInwestycji = scanner.nextDouble();

        System.out.print("Podaj roczne oprocentowanie w procentach: ");
        double roczneOprocentowanie = scanner.nextDouble();

        System.out.print("Podaj liczbę lat: ");
        int liczbaLat = scanner.nextInt();

        double miesiecznaStopaOprocentowania = roczneOprocentowanie / 100 / 12;
        double przyszlaWartoscInwestycji = kwotaInwestycji * Math.pow(1 + miesiecznaStopaOprocentowania, liczbaLat * 12);

        System.out.printf("Przyszła wartość inwestycji to %.2f zł", przyszlaWartoscInwestycji);
    }

    }
    


