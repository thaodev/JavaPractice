import java.util.Random;
import java.util.Scanner;

public class FixRandomNum {
    public static void main(String[] args) {
        System.out.print("What is your guess? ");
        System.out.println();
        int guess_num;
        Random number = new Random();
        int upperbound = 5;
        int lucky_num = number.nextInt(upperbound);

        Scanner guess = new Scanner(System.in);

        do {
            guess_num = guess.nextInt();
            if (guess_num == lucky_num) {
                System.out.print("You won $1M");
            }
            else {
                System.out.print("The random number was " + lucky_num);
                System.out.println();
            }
        }
        while(guess_num != 0);

    }
}
