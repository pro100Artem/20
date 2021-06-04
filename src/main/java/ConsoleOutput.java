public class ConsoleOutput {
    public void outputtingRulesGame() {
        System.out.println("В начале игры на столе лежит 20 спичек.\n" +
                "Игроки ходят по очереди, убирая на выбор 1, 2 или 3 спички.\n" +
                "Проигравшим считается тот, кто возьмет со стола последнюю спичку.");
    }

    public void displayingTheRemainingNumberOfMatches(int remainingNumberOfMatches) {
        System.out.println("На столе осталось: " + remainingNumberOfMatches + " спичек.");
    }

    public void outputtingComputerRunning(int numberOfMatchesSelectedByTheComputer) {
        System.out.println("Ход компьютера:\n" +
                "Количество спичек выбранное компьютером = "
                + numberOfMatchesSelectedByTheComputer);
    }

    public void firstPleaseEnterPlayerNumber() {
        System.out.println("Ваш ход! введите число спичек: ");
    }

    public void wrongNumberPlayer() {
        System.out.println("Вы ввели не корректное значение! введите от 1 до 3:");
    }

    public void endGame() {
        System.out.println("Вы забирайте последнюю спичку и проигрывайте!");
    }
}
