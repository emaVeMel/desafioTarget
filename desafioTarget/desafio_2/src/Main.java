import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner board = new Scanner(System.in);

        System.out.println("Input an integer.");
        int f = board.nextInt();

        if (Math.sqrt(5 * f * f + 4) - Math.floor(Math.sqrt(5 * f * f + 4)) == 0.0 ||
                Math.sqrt(5 * f * f - 4) - Math.floor(Math.sqrt(5 * f * f - 4)) == 0.0) {
            System.out.println("The number is a Fibonacci number");
        } else System.out.println("The number isn't a Fibonacci number");

        board.close();
    }
}