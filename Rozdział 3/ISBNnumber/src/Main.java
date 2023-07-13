import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj pierwszych 9 cyfr numeru ISBN jako liczbę całkowitą: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        int g = input.nextInt();
        int h = input.nextInt();
        int i = input.nextInt();

        int last = (a * 1 + b * 2 + c * 3 + d * 4 + e * 5 + f * 6 + g * 7 + h * 8 + i * 9) % 11;

        String isbn;
        if (last == 10) {
            isbn = String.format("%d%d%d%d%d%d%d%d%dX", a, b, c, d, e, f, g, h, i);
        } else {
            isbn = String.format("%d%d%d%d%d%d%d%d%d%d", a, b, c, d, e, f, g, h, i, last);
        }

        System.out.println("Numer ISBN-10 to " + isbn);
    }
}
