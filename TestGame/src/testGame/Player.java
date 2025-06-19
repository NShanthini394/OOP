package testGame;

import javax.swing.*;
import java.util.InputMismatchException;

public class Player {
    public static void main(String[] args) {
        String name = "";
        boolean valid = false;

        while (!valid) {
            try {
                name = JOptionPane.showInputDialog(null, "Enter your name:", "Survival Game", JOptionPane.PLAIN_MESSAGE);

                if (name == null) {
                    JOptionPane.showMessageDialog(null, "Game exited. Goodbye!");
                    return;
                }

                name = name.trim();

                if (name.isEmpty()) {
                    throw new InputMismatchException("Name cannot be empty.");
                }

                if (!name.matches("[a-zA-Z ]+")) {
                    throw new InputMismatchException("Name must contain only letters.");
                }

                valid = true;

            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Invalid input: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        JOptionPane.showMessageDialog(null, "Good luck, " + name + "! \nThe game will now start.", "Start", JOptionPane.INFORMATION_MESSAGE);

        Scenario scenario = new Scenario(name);
        scenario.playGame(); // This continues in console
    }
}
