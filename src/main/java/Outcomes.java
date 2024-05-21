import java.util.Scanner;

public class Outcomes {

    int counter;

    static boolean playerWins(String yourMove, String compMove) {
        if (yourMove.equals("rock")) {
            return compMove.equals("scissors");
        } else if (yourMove.equals("paper")) {
            return compMove.equals("rock");
        } else {
            return compMove.equals("paper");
        }
    }

    static boolean aDraw(String yourMove, String compMove) {
        return (yourMove.equals(compMove));
    }

    public static int getCounter(){
        System.out.println("How many times shall we play?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
