
import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        String response = "";
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("What is your string? ");
            String str = sc.nextLine();
            String[] words = str.split(" ");
            for (String letters : words) {
                System.out.println(letters);
            }

            Scanner rep = new Scanner(System.in);
            System.out.println("Do you want to play again? ");
            response = rep.next();

        } while (response.toUpperCase().equals("YES"));
    }
}

