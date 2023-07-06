import java.util.Scanner;

public class ComputeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("(0-osoby samotne, 1-małżeństwo wspólnie lub wdowa/wdowiec, 2-małżeństwo osobno, 3-głowa gospodarstwa) Podaj rodzaj deklaracji: ");
        int status = input.nextInt();

        System.out.print("Podaj wysokość opodatkowanego dochodu: ");
        double income = input.nextDouble();

        double tax = 0;

        if (status == 0) {
            if (income <= 8350)
                tax = income * 0.10;
            else if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350) * 0.15;
            else if (income <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
            else if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
            else if (income <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
        }
        else if (status == 1) {
            // Obliczanie podatku dla par rozliczających się wspólnie lub dla wdów/wdowców spełniających warunki
            // TODO: implementacja dla statusu 1
        }
        else if (status == 2) {
            // Obliczanie podatku dla par rozliczających się osobno
            // TODO: implementacja dla statusu 2
        }
        else if (status == 3) {
            // Obliczanie podatku dla głowy gospodarstwa domowego
            // TODO: implementacja dla statusu 3
        }
        else {
            System.out.println("Błąd: nieprawidłowy rodzaj deklaracji");
            System.exit(1);
        }

        System.out.println("Podatek wynosi " + (int)(tax * 100) / 100.0);
    }
}
