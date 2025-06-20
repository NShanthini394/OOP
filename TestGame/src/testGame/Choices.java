package testGame;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Choices {

    private final Scanner scanner = new Scanner(System.in);
    private final Game game;

    public Choices(Game game) {
        this.game = game;
    }

    public int getChoice(String message) {
        while (true) {
            String input = JOptionPane.showInputDialog(null, message, "Survival Game", JOptionPane.PLAIN_MESSAGE);

            if (input == null) {
                JOptionPane.showMessageDialog(null, "You exited the game.", "Exit", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }

            input = input.trim();

            try {
                int choice = Integer.parseInt(input);

                if (choice >= 1 && choice <= 3) {
                    return choice;
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Invalid choice! Please enter only 1, 2, or 3.",
                            "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null,
                        "Invalid input! Please enter a NUMBER: 1, 2, or 3.",
                        "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void applyChoice(ChoiceType choiceType) {
        choiceType.apply(game);
    }

    public boolean checkStatus() {
        if (!game.isAlive()) {
            JOptionPane.showMessageDialog(null, "You did not make it. Time to reflect and retry!\n"
                    + "Your grade: F"
                    + "\n\nYou have lost all your health. Game Over.", "You lost!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
