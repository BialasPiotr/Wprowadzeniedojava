public class Main {
    public static void main(String[] args) {
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