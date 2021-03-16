import java.util.Scanner;

public class printSquare {
    public static void square(int min, int max) {
        for (int i = min; i <= max; i++) {
            for (int j = i; j <= max; j++) {
                System.out.print(j);
            }
            for (int j = min; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String answer = "";
        do {
            System.out.println("Prepare your min and max for the square");
            Scanner sc = new Scanner(System.in);
            System.out.println("What is your min? ");
            int min = sc.nextInt();
            System.out.println("What is your max?");
            int max = sc.nextInt();
            square(min, max);
            System.out.println("Do you want to try a different range? ");
            Scanner res = new Scanner(System.in);
            answer = res.next();

        } while (answer.toLowerCase().equals("yes") || answer.toLowerCase().equals("y"));
    }
}
