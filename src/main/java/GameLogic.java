
import java.util.InputMismatchException;
import java.util.Scanner;

public class GameLogic {
    private static int remainingMatches = 20;


    private int playerChoiceNumber() {
        int playerChoiceNumber = 0;
        try {
            Scanner scanner = new Scanner(System.in);
            playerChoiceNumber = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Надо ввести число!!!");
        }

        return playerChoiceNumber;
    }

    private void playerTern() {
        int i = playerChoiceNumber();
        if (i > 0 && i < 4) {
            remainingMatches -= i;
        } else {
            new ConsoleOutput().wrongNumberPlayer();
            playerTern();
        }
    }

    private void computerTern() {
        new ConsoleOutput().outputtingComputerRunning(ComputerLogic.computerRunningLogic(remainingMatches));
        remainingMatches -= ComputerLogic.computerRunningLogic(remainingMatches);
    }

    public void gameRun() {
        ConsoleOutput consoleOutput = new ConsoleOutput();
        consoleOutput.outputtingRulesGame();
        while (remainingMatches >= 5) {
            computerTern();
            consoleOutput.displayingTheRemainingNumberOfMatches(remainingMatches);
            consoleOutput.firstPleaseEnterPlayerNumber();
            playerTern();
            consoleOutput.displayingTheRemainingNumberOfMatches(remainingMatches);
        }
        computerTern();
        consoleOutput.displayingTheRemainingNumberOfMatches(remainingMatches);
        consoleOutput.endGame();
    }
}
