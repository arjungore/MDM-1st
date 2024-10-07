import java.util.Random;

public class SmallRandomExample {
    public static void main(String[] args) {
        // Create an instance of Random class
        Random random = new Random();

        // Generate a random integer between 0 and 9
        int randomNumber = random.nextInt(10); // 0 to 9
        System.out.println("Random Number (0-9): " + randomNumber);
    }
}
