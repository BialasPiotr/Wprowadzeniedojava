public class ShowCurrentTime {
    public static void main(String[] args) {
        // Pobieranie liczby milisekund od północy 1 stycznia 1970 roku
        long totalMilliseconds = System.currentTimeMillis();

        // Pobieranie liczby sekund od północy 1 stycznia 1970 roku
        long totalSeconds = totalMilliseconds / 1000;

        // Obliczanie bieżącej sekundy w aktualnej minucie aktualnej godziny
        long currentSecond = totalSeconds % 60;

        // Obliczanie liczby minut
        long totalMinutes = totalSeconds / 60;

        // Obliczanie bieżącej minuty w aktualnej godzinie
        long currentMinute = totalMinutes % 60;

        // Obliczanie liczby godzin
        long totalHours = totalMinutes / 60;

        // Obliczanie bieżącej godziny
        long currentHour = totalHours % 24;

        // Wyświetlanie wyników
        System.out.println("Aktualny czas to " + currentHour + ":"
                + currentMinute + ":" + currentSecond + " GMT");
    }
}
