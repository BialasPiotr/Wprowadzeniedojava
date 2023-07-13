import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 100);
        int number2 = (int)(Math.random() * 100);

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.print("Ile wynosi " + number1 + " + " + number2 + "? ");
        Scanner input = new Scanner(System.in);
        int answer = input.nextInt();

        if (number1 + number2 == answer)
            System.out.println("Dobrze!");
        else {
            System.out.println("Błędna odpowiedź.");
            System.out.println(number1 + " + " + number2 + " równa się " + (number1 + number2));
        }
    }
}
