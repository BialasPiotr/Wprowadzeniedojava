
public class Main {
    public static void main(String[] args) {
//1.1
        System.out.println("Witaj w Javie, Witaj informatyki i Programowanie to przyjemnosc!");
        
//1.2
        System.out.println("Witaj w javie");
        System.out.println("Witaj w javie");
        System.out.println("Witaj w javie");
        System.out.println("Witaj w javie");
        System.out.println("Witaj w javie");
        //1.3
        System.out.println("   J  A  V       V  A");
        System.out.println("   J  AA  V     V   AA");
        System.out.println("J  J AAAA  V   V   AAAA");
        System.out.println(" JJ A    A   V    A    A");

        //1.4
        System.out.println(" a a^2 a^3");
        System.out.println(" 1  1  1");
        System.out.println(" 2  4  8");
        System.out.println(" 3  9  27");
        System.out.println(" 4  16 64");

        //1.5
        double x;
        double y;
        x = 9.5 * 4.5 - 2.5 * 3;
        y = 45.5 - 3.5;

        System.out.println(x/y);

        //1.6
         int liczba = (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9);
        System.out.println("1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = " + liczba);

        obliczeniekola();

        obliczenieprostokatna();

        biegacz();

        Ludnosc();
        }
    public static void obliczeniekola(){
        //1.8
        double PI = 3.14;
        double promien = 5.5;
        double obwod = 2 * promien * PI;
        double powierzchnia = promien * promien * PI;
        System.out.println("Obwod koła o promieniu 5.5 wynosi:  " + obwod);
        System.out.println("Powierzchnia kola wynosi: " + powierzchnia);
    }
    public static void obliczenieprostokatna(){
        //1.9
        double wysokosc = 7.9;
        double szerokosc = 4.5;
        double powierzchnia = szerokosc * wysokosc;
        System.out.println(" Powierzchnia prostokatna wynosi: " + powierzchnia);
    }
    public static void biegacz(){
        //1.10
        double Mila = 1.6;
        int KM = 14;
        double srednia = KM / Mila  ;
        System.out.println("Srednia predkosc w milach wynosi " + srednia + " na godzine");
    }
    public static void Ludnosc(){
        //1.11
        int Populacja = 312032486;
        int sekundywroku = 365 * 24 * 60 * 60;
        int rodzi = sekundywroku / 7;
        int umiera = sekundywroku / 13;
        int imigrant = sekundywroku / 45;
        int populacjawciaguroku = rodzi - umiera  + imigrant;

        int rok1 = Populacja + (populacjawciaguroku * 1);
        int rok2 = Populacja + (populacjawciaguroku * 2);
        int rok3 = Populacja + (populacjawciaguroku * 3);
        int rok4 = Populacja + (populacjawciaguroku * 4);
        int rok5 = Populacja + (populacjawciaguroku * 5);

        System.out.println("prognoza na rok 1: " + rok1 + " ludzi");
        System.out.println("prognoza na rok 2: " + rok2 + " ludzi");
        System.out.println("prognoza na rok 3: " + rok3 + " ludzi");
        System.out.println("prognoza na rok 4: " + rok4 + " ludzi");
        System.out.println("prognoza na rok 5: " + rok5 + " ludzi");

        }


    }

