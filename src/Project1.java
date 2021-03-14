import java.util.Random;
import java.util.Scanner;

public class Project1 {
    public static void main(String[] args) {
        play();
        report();
    }

    static int currentGameGuessNum = 0;
    static int totalGameGuessNum = 0;
    static int num_of_game = 0;

    public static void play() {
        boolean isContinue = true;
        boolean isNewGame = true;

        /*
        Random rand = new Random(); //create object rand of random class
        int upperbound = 100;
        int int_random = rand.nextInt(upperbound);//generate random values from 0-100
        System.out.print("The lucky number from 0 to " + upperbound + ": " + int_random);
        System.out.println();
        */

        int count = 1;
        String response = "";
        int int_random = -1;
        int upperbound = 100;

        do {
            if (isNewGame) {
                Random rand = new Random(); //create a new object rand of random class
                int_random = rand.nextInt(upperbound);//generate random values from 0-100
                System.out.print("The lucky number from 0 to " + upperbound + ": " + int_random);
                System.out.println();
                isContinue = true;
                currentGameGuessNum = 0;
                num_of_game++;
            }

            System.out.print("What is your guess?");
            Scanner input = new Scanner(System.in); //Create object input of Scanner class to input data or create a input Scanner variable to take the input value
            int guess = input.nextInt();
            System.out.println("Your input number is: " + guess);

            if (guess > int_random) {
                System.out.print("Your guess is greater than the lucky number");
                System.out.println();
                isNewGame = false;

            } else if (guess < int_random) {
                System.out.print("Your guess is smaller than the lucky number");
                System.out.println();
                isNewGame = false;
            } else {
                System.out.print("You got it right in " + (currentGameGuessNum + 1) + " guesses");
                System.out.println();
                System.out.print("Do you want to play again?");
                System.out.println();
                Scanner isPlayAgain = new Scanner(System.in);
                response = isPlayAgain.next();

                if (!response.equals("Yes")) {
                    isContinue = false;
                }

                isNewGame = true;
            }

            currentGameGuessNum++;
            totalGameGuessNum++;
        } while (isContinue);

    }
    public static void report() {
        System.out.println("Overall results:");
        System.out.println("Total games = " + num_of_game);
        System.out.println("Total guesses = " + totalGameGuessNum);
        System.out.println("Guesses/game = " + totalGameGuessNum /num_of_game);
        //System.out.println("Total guesses = " + count++)
    }
}

