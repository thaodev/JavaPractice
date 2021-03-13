import java.util.Scanner;

public class LuckyNumberCount {
    public static void main(String[] args) {
       play();

    }

    public static void play() {
        int lucky_num = 55;
        System.out.print("How many times do you want to guess?");
        Scanner guess = new Scanner(System.in);
        int guess_times = guess.nextInt();
        System.out.print("You want to play " + guess_times + " times");
        System.out.println();



        int rcount = 1;

           for (int i = 1; i <= guess_times; i++){
               Scanner input = new Scanner(System.in);
               int num = input.nextInt();

               System.out.print("Your guess is: " + num);
               System.out.println();


               if (num > lucky_num) {
                   System.out.print("your guess is greater than the lucky number");
                   System.out.println();
               } else if (num < lucky_num) {
                   System.out.print("Your guess is smaller than the lucky number");
                   System.out.println();
               } else {
                   System.out.print("your guess is correct after " + rcount + " times of trying");
                   System.out.println();
               }


               rcount++;
           }





    }
}
