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

    public void riskyChoice(int damage) {
        System.out.println("\nThat choice had serious consequences!");
        game.updateHealth(damage);
    }

    public void goodChoice(int heal) {
        System.out.println("\nYou make the right choice!");
        game.updateHealth(heal);
    }

    public boolean checkStatus() {
        if (!game.isAlive()) {
            System.out.println("\nYou have lost all your health. Game Over.");
            return false;
        }
        return true;
    }
}
