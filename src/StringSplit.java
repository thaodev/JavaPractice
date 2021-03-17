
import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        String response = "";
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("What is your string? ");
            String str = sc.nextLine();
            String[] words = str.split(" ");//split the str into words by using space as a seperator and store those words into an array named words
            for (String letters : words) {//for loop to run through each word in the words array
                System.out.println(letters);
            }

            Scanner rep = new Scanner(System.in);
            System.out.println("Do you want to play again? ");
            response = rep.next();

        } while (response.toUpperCase().equals("YES"));
    }
}

