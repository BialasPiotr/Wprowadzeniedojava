import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Podaj wagę w funtach: ");
        double weight = input.nextDouble();

        System.out.print("Podaj wzrost w calach: ");
        double height = input.nextDouble();

        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;

        double weightInKilograms = weight * KILOGRAMS_PER_POUND;
        double heightInMeters = height * METERS_PER_INCH;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        System.out.println("BMI wynosi " + bmi);
        if (bmi < 18.5)
            System.out.println("Niedowaga");
        else if (bmi < 25)
            System.out.println("Norma");
        else if (bmi < 30)
            System.out.println("Nadwaga");
        else
            System.out.println("Otyłość");
    }
}
