import java.util.Scanner;

public class printGrid {
    public static void Grid(int row, int col) {
        for (int i = 1; i <= row;i++ ) {
            System.out.print(i);
            for (int j = i+row; j <= row*col; j+=row) {
                System.out.print(", " +j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String response = "";
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("What is number of rows? ");
            int ro = sc.nextInt();
            System.out.println("What is number of cols");
            int co = sc.nextInt();
            Grid(ro, co);
            System.out.println("do you want to play again? ");
            Scanner res = new Scanner(System.in);
            response = res.next();

        } while (response.toLowerCase().equals("yes") || response.toLowerCase().equals("y"));
    }
}
