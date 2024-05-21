import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int counter;

        Scanner input = new Scanner(System.in);


        for (int i = 0; i < Outcomes.getCounter(); i++) {


            System.out.println("Rock, Paper, or Scissors? You go first!");
            String yourMove = input.nextLine();

            Random computer = new Random();
            int randomComp = computer.nextInt(3);

            String compMove;
            if (randomComp == 0) {
                compMove = "rock";
            } else if (randomComp == 1) {
                compMove = "paper";
            } else {
                compMove = "scissors";
            }
            System.out.println("Computer plays " + compMove);

            if (Outcomes.aDraw(yourMove, compMove)) {
                System.out.println("It's a tie!");
            } else if (Outcomes.playerWins(yourMove, compMove)) {
                System.out.println("You Win!");
            } else {
                System.out.println("You Lose! Play Again?");
            }
        }
    }
}
