public class ComputerLogic {
    public static int computerRunningLogic(int remainingNumberOfMatches) {
        int numberOfMatchesSelectedByTheComputer = 0;
        switch (remainingNumberOfMatches) {
            case 20:
            case 16:
            case 12:
            case 8:
            case 4:
                numberOfMatchesSelectedByTheComputer = 3;
                break;
            case 15:
            case 11:
            case 7:
            case 3:
                numberOfMatchesSelectedByTheComputer = 2;
                break;
            case 14:
            case 10:
            case 6:
            case 2:
                numberOfMatchesSelectedByTheComputer = 1;
        }
        return numberOfMatchesSelectedByTheComputer;
    }

}
