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
        String input1 = JOptionPane.showInputDialog(null, "Level 1: You wake up in a dense jungle. It's raining heavily.\n\n"
                + "1. Explore deeper into the jungle.\n"
                + "2. Hide under a tree.\n"
                + "3. Climb a tree to get a better view.\n\n"
                + "Enter your choice: ",
                "Survival Game", JOptionPane.PLAIN_MESSAGE);

        int choice1 = Integer.parseInt(input1);
        switch (choice1) {
            case 1 ->
                choice.applyChoice(new RiskyChoice(-25));
            case 2 ->
                choice.applyChoice(new GoodChoice(10));
            default ->
                choice.applyChoice(new GoodChoice(5));
        }

        displayHealth();
        if (!choice.checkStatus()) {
            return;
        }

        // Level 2
        String input2 = JOptionPane.showInputDialog(null, "Level 2: You are hungry and find strange berries.\n\n"
                + "1. Eat the berries.\n"
                + "2. Skip the berries and keep walking.\n"
                + "3. Use the berries as a trail marker.\n\n"
                + "Enter your choice: ",
                "Survival Game", JOptionPane.PLAIN_MESSAGE);

        int choice2 = Integer.parseInt(input2);
        switch (choice2) {
            case 3 ->
                choice.applyChoice(new RiskyChoice(-20));
            case 1 ->
                choice.applyChoice(new GoodChoice(10));
            default ->
                choice.applyChoice(new GoodChoice(5));
        }

        displayHealth();
        if (!choice.checkStatus()) {
            return;
        }

        // Level 3
        String input3 = JOptionPane.showInputDialog(null, "Level 3: It's nightfall and you're cold.\n\n"
                + "1. Sleep under leaves.\n"
                + "2. Try to build a fire.\n"
                + "3. Climb a tall tree.\n\n"
                + "Enter your choice: ",
                "Survival Game", JOptionPane.PLAIN_MESSAGE);

        int choice3 = Integer.parseInt(input3);
        switch (choice3) {
            case 1 ->
                choice.applyChoice(new GoodChoice(5));
            case 2 ->
                choice.applyChoice(new GoodChoice(10));
            default ->
                choice.applyChoice(new RiskyChoice(-30));
        }

        displayHealth();
        if (!choice.checkStatus()) {
            return;
        }

        // Level 4
        String input4 = JOptionPane.showInputDialog(null, "Level 4: You see an abandoned backpack near a bush.\n\n"
                + "1. Carefully check the backpack.\n"
                + "2. Kick it and run away.\n"
                + "3. Grab it and run fast.\n\n"
                + "Enter your choice: ",
                "Survival Game", JOptionPane.PLAIN_MESSAGE);

        int choice4 = Integer.parseInt(input4);
        switch (choice4) {
            case 3 ->
                choice.applyChoice(new RiskyChoice(-25));
            case 1 ->
                choice.applyChoice(new GoodChoice(8));
            default ->
                choice.applyChoice(new GoodChoice(5));
        }

        displayHealth();
        if (!choice.checkStatus()) {
            return;
        }

        // Level 5
        String input5 = JOptionPane.showInputDialog(null, "Level 5: You find a river blocking your path.\n\n"
                + "1. Swim across the river.\n"
                + "2. Walk along the river to find a shallow spot.\n"
                + "3. Build a small bridge with branches.\n\n"
                + "Enter your choice: ",
                "Survival Game", JOptionPane.PLAIN_MESSAGE);

        int choice5 = Integer.parseInt(input5);
        switch (choice5) {
            case 1 ->
                choice.applyChoice(new RiskyChoice(-35));
            case 3 ->
                choice.applyChoice(new GoodChoice(10));
            default ->
                choice.applyChoice(new GoodChoice(5));
        }

        displayHealth();
        if (!choice.checkStatus()) {
            return;
        }

        getGrade();

        // Winning
        JOptionPane.showMessageDialog(null, "Congratulations, " + playerName + "! You survived the wilderness!", 
                "Congratulations!", JOptionPane.PLAIN_MESSAGE);
    }
}
