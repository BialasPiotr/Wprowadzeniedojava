
public class Main {
    public static void main(String[] args) {
        int losowy =  (int) (Math.random() * 12) + 1;

        String miesiac = getmiesiac (losowy);

        System.out.println("Wylosowany miesiąc: " + miesiac );
    }

    public static String getmiesiac (int losowy) {
        String miesiac ;

        switch (losowy) {
            case 1:
                miesiac  = "styczeń";
                break;
            case 2:
                miesiac  = "luty";
                break;
            case 3:
                miesiac = "marzec";
                break;
            case 4:
                miesiac  = "kwiecień";
                break;
            case 5:
                miesiac  = "maj";
                break;
            case 6:
                miesiac  = "czerwiec";
                break;
            case 7:
                miesiac  = "lipiec";
                break;
            case 8:
                miesiac  = "sierpień";
                break;
            case 9:
                miesiac  = "wrzesień";
                break;
            case 10:
                miesiac  = "październik";
                break;
            case 11:
                miesiac  = "listopad";
                break;
            case 12:
                miesiac  = "grudzień";
                break;
            default:
                miesiac  = "Nieprawidłowy numer miesiąca";
        }

        return miesiac ;
    }
}
