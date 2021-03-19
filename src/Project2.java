import java.text.DecimalFormat;
import java.util.Scanner;

public class Project2 {
    static double weightScoreMid = 0, weightScoreF = 0, weightScoreHw = 0;
    public static void main(String[] args) {
        begin();
        midterm();
        finalF();
        homework();
        report();
    }
    public static void begin() {
        System.out.println("This program reads exam/homework scores and reports your overall course grade.");
    }

    private static DecimalFormat df = new DecimalFormat("0.0");

    public static double midterm() {
        System.out.println("Midterm:");
        /* input weight for midterm*/
        System.out.print("Weight (0-100)? ");
        Scanner midterm = new Scanner(System.in);
        int weightMid = midterm.nextInt();
        System.out.println();

        /* input score for midterm */
        System.out.print("Score earned? ");
        int scoreMid = midterm.nextInt();
        System.out.println();

        /*Score shifted?*/
        System.out.print("Were scored shifted (1=yes, 2=no)?");
        int scoreShifted = midterm.nextInt();
        System.out.println();

        int totalPoints = 0;
        if (scoreShifted == 1) {
            System.out.print("Shift amount? ");
            int shiftAmt = midterm.nextInt();
            if (scoreMid + shiftAmt > 100) {
                totalPoints = 100;
            } else {
                totalPoints = scoreMid + shiftAmt;
            }
        }
        else {
            totalPoints = scoreMid;
        }

        System.out.println("Total points = " + totalPoints + " / 100");
        /*Final weighted score cal*/
        weightScoreMid = ((double)totalPoints/100)*weightMid;

        System.out.println("Weighted score = " + df.format(weightScoreMid)+ " / " + weightMid);
        return weightScoreMid;
    }
    public static double finalF() {
        System.out.println("Final:");
        /* input weight for midterm*/
        System.out.print("Weight (0-100)? ");
        Scanner finalF = new Scanner(System.in);
        int weightFinal = finalF.nextInt();
        System.out.println();

        /* input score for midterm */
        System.out.print("Score earned? ");
        int scoreFinal = finalF.nextInt();
        System.out.println();

        /*Score shifted?*/
        System.out.print("Were scored shifted (1=yes, 2=no)?");
        int scoreShiftedF = finalF.nextInt();
        System.out.println();

        int totalPointsF = 0;
        if (scoreShiftedF == 1) {
            System.out.print("Shift amount? ");
            int shiftAmt = finalF.nextInt();

            if (scoreFinal + shiftAmt > 100) {
                totalPointsF = 100;
            } else {
                totalPointsF = scoreFinal + shiftAmt;
            }
        }
        else {
            totalPointsF = scoreFinal;
        }

        System.out.println("Total points = " + totalPointsF + " / 100");
        /*Final weighted score cal*/
        weightScoreF = ((double)totalPointsF/100)*weightFinal;
        System.out.println("Weighted score = " + df.format(weightScoreF) + " / " + weightFinal);
        return weightScoreF;
    }
    public static double homework() {
        System.out.println("Homework:");

        Scanner hw = new Scanner(System.in);
        System.out.print("Weight (0-100)? ");
        int weightHw = hw.nextInt();
        System.out.println();

        System.out.print("Number of assignments? ");
        int assignNo = hw.nextInt();
        int sumScore = 0, sumMax = 0;
        for (int i = 1; i <= assignNo; i++) {
            System.out.print("Assignment " + i + " score and max? ");
            Scanner input = new Scanner(System.in);
            int score = input.nextInt();
            int maxN = input.nextInt();
            System.out.println();
            sumScore += score;
            sumMax += maxN;
        }

        System.out.print("How many sections did you attend? ");
        int sectionNo = hw.nextInt();
        System.out.println();

        int sectionPoint = sectionNo*5;
        System.out.println("Section points = " + sectionPoint + " / 30");

        int totalPointsHw = sumScore + sectionPoint;
        int totalMax = sumMax + 30;
        System.out.println("Total points = " + totalPointsHw + "/ " + totalMax);
        weightScoreHw = ((double)totalPointsHw/totalMax)*weightHw;
        System.out.println("Weighted Score = " + df.format(weightScoreHw) + " / " + weightHw);
        return weightScoreHw;

    }
    public static void report() {
        System.out.println();
        double total = weightScoreMid + weightScoreF + weightScoreHw;
        System.out.println("Overall percentage = " + df.format(total));
        System.out.println("Your grade will be at least: 3.0");
        if (total > 84.99) {
            System.out.println("You passed. Congrats");
        }
        else if (total < 74.99 && total > 60) {
            System.out.println("You didn't pass and your GPA is at 2.0");
        }
        else {
            System.out.println("You suck as your GPA is 0");
        }
    }
}
