import java.util.Scanner;

public class StringVertical {

    public static void main(String[] args) {
        String ans = "";
        do {

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Enter a String:");
            String Input = keyboard.nextLine();
            //int stringLength = Input.length();
            //positionOfChars = Input.substring(0, stringLength);

            for (int i = 0; i < Input.length(); i++) {
                char letter = Input.charAt(i);
                System.out.println(letter);
            }

            Scanner rep = new Scanner(System.in);
            System.out.println("Do you want to play again? ");
            ans = rep.next();
        } while(ans.toLowerCase().equals("yes"));

        }

    }


