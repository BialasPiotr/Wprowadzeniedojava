import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę całkowitą:");
        int a = input.nextInt();
        System.out.println("Podaj drugą liczbę całkowitą:");
        int b = input.nextInt();
        System.out.println("Podaj trzecią liczbę całkowitą:");
        int c = input.nextInt();

        if (a <= b && b <= c) {
            System.out.println("Posortowane liczby: " + a + ", " + b + ", " + c);
        } else if (a <= c && c <= b) {
            System.out.println("Posortowane liczby: " + a + ", " + c + ", " + b);
        } else if (b <= a && a <= c) {
            System.out.println("Posortowane liczby: " + b + ", " + a + ", " + c);
        } else if (b <= c && c <= a) {
            System.out.println("Posortowane liczby: " + b + ", " + c + ", " + a);
        } else if (c <= a && a <= b) {
            System.out.println("Posortowane liczby: " + c + ", " + a + ", " + b);
        } else {
            System.out.println("Posortowane liczby: " + c + ", " + b + ", " + a);
        }
    }
}
