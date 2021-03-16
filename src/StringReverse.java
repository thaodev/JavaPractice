import java.sql.SQLOutput;
import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        String response = "";
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("What is the string in your mind? ");
            String userInput = sc.next();
            for (int i = 1; i <= userInput.length(); i++) {
                char Outcome = userInput.charAt(userInput.length()-i);
                System.out.print(Outcome);
            }
            System.out.println();
            Scanner rep = new Scanner(System.in);
            System.out.println("Do you want to play again?");
            response = rep.next();


        } while (response.toLowerCase().equals("yes"));

    }
}
