import java.util.Locale;
import java.util.Scanner;

public class writeChars {
    public static void writeChar(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        else if (n == 1) {
            System.out.print("*");
        }
        else if (n == 2) {
            System.out.print("**");
        }
        else {
            System.out.print("<");
            writeChar(n-2);
            System.out.print(">");
        }
    }
    public static void main(String[] args) {
        String rep="";
        do {
            System.out.println("What is your input number?");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println("Your output looks like below:");
            writeChar(num);
            System.out.println();

            System.out.println("Would you like to play again?");
            Scanner answer = new Scanner(System.in);
            rep = answer.next();
        } while (rep.toUpperCase().equals("YES"));
    }
}
