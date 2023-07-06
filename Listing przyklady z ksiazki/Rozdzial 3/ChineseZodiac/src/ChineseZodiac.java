import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Wpisz rok: ");
        int year = input.nextInt();

        switch (year % 12) {
            case 0: System.out.println("małpa"); break;
            case 1: System.out.println("kogut"); break;
            case 2: System.out.println("pies"); break;
            case 3: System.out.println("świnia"); break;
            case 4: System.out.println("szczur"); break;
            case 5: System.out.println("bawół"); break;
            case 6: System.out.println("tygrys"); break;
            case 7: System.out.println("królik"); break;
            case 8: System.out.println("smok"); break;
            case 9: System.out.println("wąż"); break;
            case 10: System.out.println("koń"); break;
            case 11: System.out.println("owca"); break;
        }
    }
}
