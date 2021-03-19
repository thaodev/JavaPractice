import java.util.Scanner;

public class Project2Homework {
    public static void main(String[] args) {
        System.out.print("Number of assignments? ");
        Scanner asm = new Scanner(System.in);
        int assignNo = asm.nextInt();

        for (int i = 1; i <= assignNo; i++) {
            System.out.print("Assignment " + i + " score and max? ");
            Scanner input = new Scanner(System.in);
            int score = input.nextInt();
            int max = input.nextInt();
            System.out.println();
        }
    }
}
