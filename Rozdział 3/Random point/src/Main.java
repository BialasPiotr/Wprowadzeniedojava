import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int width = 100;
        int height = 200;
        int x = random.nextInt(width) - width/2;
        int y = random.nextInt(height) - height/2;
        System.out.println("Losowy punkt: (" + x + ", " + y + ")");
    }
}
