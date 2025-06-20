package testGame;

import javax.swing.JOptionPane;

public class Scenario extends Game {

    private final Choices choice;
    private final String playerName;

    public Scenario(String playerName) {
        super();
        this.choice = new Choices(this);
        this.playerName = playerName;
    }

    @Override
    public void playGame() {
        displayHealth();

        // Level 1
        int choice1 = getUserChoice(
                "Level 1: You wake up in a dense jungle. It's raining heavily.\n\n"
                        + "1. Explore deeper into the jungle.\n"
                        + "2. Hide under a tree.\n"
                        + "3. Climb a tree to get a better view.\n\n"
                        + "Enter your choice:");
        switch (choice1) {
            case 1 -> choice.applyChoice(new RiskyChoice(-25));
            case 2 -> choice.applyChoice(new GoodChoice(10));
            case 3 -> choice.applyChoice(new GoodChoice(5));
        }

        displayHealth();
        if (!choice.checkStatus()) return;

        // Repeat same pattern for other levels...

        // Level 2
        int choice2 = getUserChoice(
                "Level 2: You are hungry and find strange berries.\n\n"
                        + "1. Eat the berries.\n"
                        + "2. Skip the berries and keep walking.\n"
                        + "3. Use the berries as a trail marker.\n\n"
                        + "Enter your choice:");
        switch (choice2) {
            case 1 -> choice.applyChoice(new GoodChoice(10));
            case 2 -> choice.applyChoice(new GoodChoice(5));
            case 3 -> choice.applyChoice(new RiskyChoice(-20));
        }

        displayHealth();
        if (!choice.checkStatus()) return;

        // Level 3
        int choice3 = getUserChoice(
                "Level 3: It's nightfall and you're cold.\n\n"
                        + "1. Sleep under leaves.\n"
                        + "2. Try to build a fire.\n"
                        + "3. Climb a tall tree.\n\n"
                        + "Enter your choice:");
        switch (choice3) {
            case 1 -> choice.applyChoice(new GoodChoice(5));
            case 2 -> choice.applyChoice(new GoodChoice(10));
            case 3 -> choice.applyChoice(new RiskyChoice(-30));
        }

        displayHealth();
        if (!choice.checkStatus()) return;

        // Level 4
        int choice4 = getUserChoice(
                "Level 4: You see an abandoned backpack near a bush.\n\n"
                        + "1. Carefully check the backpack.\n"
                        + "2. Kick it and run away.\n"
                        + "3. Grab it and run fast.\n\n"
                        + "Enter your choice:");
        switch (choice4) {
            case 1 -> choice.applyChoice(new GoodChoice(8));
            case 2 -> choice.applyChoice(new GoodChoice(5));
            case 3 -> choice.applyChoice(new RiskyChoice(-25));
        }

        displayHealth();
        if (!choice.checkStatus()) return;

        // Level 5
        int choice5 = getUserChoice(
                "Level 5: You find a river blocking your path.\n\n"
                        + "1. Swim across the river.\n"
                        + "2. Walk along the river to find a shallow spot.\n"
                        + "3. Build a small bridge with branches.\n\n"
                        + "Enter your choice:");
        switch (choice5) {
            case 1 -> choice.applyChoice(new RiskyChoice(-35));
            case 2 -> choice.applyChoice(new GoodChoice(5));
            case 3 -> choice.applyChoice(new GoodChoice(10));
        }

        displayHealth();
        if (!choice.checkStatus()) return;

        getGrade();

        JOptionPane.showMessageDialog(null, "Congratulations, " + playerName + "! You survived the wilderness!",
                "Congratulations!", JOptionPane.PLAIN_MESSAGE);
    }

    // ✅ Exception-handling and error display
    private int getUserChoice(String message) {
        while (true) {
            String input = JOptionPane.showInputDialog(null, message, "Survival Game", JOptionPane.PLAIN_MESSAGE);

            if (input == null) {
                JOptionPane.showMessageDialog(null, "You exited the game.", "Exit", JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }

            input = input.trim(); // Remove spaces

            try {
                int choice = Integer.parseInt(input);

                if (choice >= 1 && choice <= 3) {
                    return choice;
                } else {
                    // Display error if input is numeric but not 1–3
                    JOptionPane.showMessageDialog(null,
                            "Invalid choice! Please enter only 1, 2, or 3.",
                            "Input Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                // Display error if input is non-numeric
                JOptionPane.showMessageDialog(null,
                        "Invalid input! Please enter a NUMBER: 1, 2, or 3.",
                        "Input Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
