package testGame;

import java.util.Scanner;

public class Choices {
    private final Scanner scanner = new Scanner(System.in);
    private final Game game;

    public Choices(Game game) {
        this.game = game;
    }

    public int getChoice() {
        int choice;
        do {
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 3);
        return choice;
    }

    public void applyChoice(ChoiceType choiceType) {
        choiceType.apply(game);
    }

    public boolean checkStatus() {
        if (!game.isAlive()) {
            System.out.println("\nYou did not make it. Time to reflect and retry!");
            System.out.println("Your grade: F");
            System.out.println("\nYou have lost all your health. Game Over.");
            return false;
        }
        return true;
    }
}