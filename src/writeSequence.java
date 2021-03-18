import java.util.Scanner;

public class writeSequence {
    public static void writeSequence(int n)  {

        if (n < 1) {
            throw new IllegalArgumentException();
        } else if (n == 1) {
            System.out.print(1);
           // return;
        } else {
            System.out.print((n + 1) / 2 + " ");
            if (n != 2) {
                writeSequence(n - 2);
                System.out.print(" ");
            }
            System.out.print((n + 1) / 2);
        }

    }


    public static void main(String[] args) {
        String response = "";
        do {
            System.out.println("What is your ending of the sequence? ");
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            System.out.println("Your sequence looks like below: ");
            writeSequence(number);
            System.out.println();
            System.out.println("Would you like to play again? ");
            Scanner rep = new Scanner(System.in);
            response = rep.next();

        } while (response.toLowerCase().equals("yes"));
    }
}


