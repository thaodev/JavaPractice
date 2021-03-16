import java.util.Scanner;

public class StringVertical {

    public static void main(String[] args) {
        String ans = "";
        do {

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Enter a String:");
            String userInput = keyboard.nextLine();
            int stringLength = userInput.length();
            //positionOfChars = userInput.substring(0, stringLength);

            for (int i = 0; i < stringLength; i++) {
                char letter = userInput.charAt(i);
                System.out.println(letter);
            }

            Scanner rep = new Scanner(System.in);
            System.out.println("Do you want to play again? ");
            ans = rep.next();
        } while(ans.toLowerCase().equals("yes"));

        }

    }


