import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj liczbę całkowitą: ");
        int number = input.nextInt();

        if (number % 5 == 0)
            System.out.println("Piątka");

        if (number % 2 == 0)
            System.out.println("Parzysta");
    }
}
