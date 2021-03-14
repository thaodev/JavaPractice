import java.util.Random;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        play();
        report();
    }

    static int num_of_guess = 1;
    static int num_of_game = 1;

    public static void play() {
        boolean isContinue = true;
        Random rand = new Random(); //create object rand of random class
        int upperbound = 100;
        int int_random = rand.nextInt(upperbound);//generate random values from 0-100
        System.out.print("The lucky number from 0 to " + upperbound + ": " + int_random);
        System.out.println();

        int count = 1;
        String response = "";
        do {
            if (response.equals("Yes")) {
                rand = new Random(); //create a new object rand of random class
                int_random = rand.nextInt(upperbound);//generate random values from 0-100
                System.out.print("The lucky number from 0 to " + upperbound + ": " + int_random);
                System.out.println();
                isContinue = true;
            }
            System.out.print("What is your guess?");
            Scanner input = new Scanner(System.in); //Create object input of Scanner class to input data or create a input Scanner variable to take the input value
            int guess = input.nextInt();
            System.out.println("Your input number is: " + guess);


            if (guess > int_random) {
                System.out.print("Your guess is greater than the lucky number");
                System.out.println();
            } else if (guess < int_random) {
                System.out.print("Your guess is smaller than the lucky number");
                System.out.println();
            } else {
                System.out.print("You got it right in " + num_of_guess + " guesses");
                System.out.println();
                System.out.print("Do you want to play again?");
                System.out.println();
                Scanner isPlayAgain = new Scanner(System.in);
                response = isPlayAgain.next();

                if (!response.equals("Yes")) {
                    isContinue = false;
                    num_of_game++;
                }

            }

            num_of_guess++;
        } while (isContinue);

    }
    public static void report() {
        System.out.println("Overall results:");
        System.out.println("Total games = " + num_of_game);
        System.out.println("Total guesses = " + num_of_guess);
        System.out.println("Guesses/game = " + num_of_guess/num_of_game);
        //System.out.println("Total guesses = " + count++)
    }
}

