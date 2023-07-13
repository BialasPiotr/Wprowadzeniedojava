import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj trzycyfrową liczbę całkowitą: ");
        int liczba = input.nextInt();

        int pierwsza = liczba / 100;
        int ostatnia = liczba % 10;

        if (pierwsza == ostatnia){
            System.out.println("Podana liczba " + liczba + " jest palindromem");

        } else {
            System.out.println("Podana liczba " + liczba + " nie jest palindromem");
        }
    }
}