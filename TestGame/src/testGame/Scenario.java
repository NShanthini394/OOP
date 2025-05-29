package testGame;

public class Scenario extends Game {
    private final Choices choice;

    public Scenario() {
        super();
        this.choice = new Choices(this);
    }

    public void playGame() {
        displayHealth();
        // Level 1
        System.out.println("Level 1: You wake up in a dense jungle. It's raining heavily.");
        System.out.println("1. Explore deeper into the jungle.");
        System.out.println("2. Hide under a tree.");
        System.out.println("3. Climb a tree to get a better view.");
        int choice1 = choice.getChoice();
        switch (choice1) {
            case 1 -> choice.applyChoice(new RiskyChoice(-25));
            case 2 -> choice.applyChoice(new GoodChoice(10));
            default -> choice.applyChoice(new GoodChoice(5));
        }

        displayHealth();
        if (!choice.checkStatus()) return;

        // Level 2
        System.out.println("Level 2: You are hungry and find strange berries.");
        System.out.println("1. Eat the berries.");
        System.out.println("2. Skip the berries and keep walking.");
        System.out.println("3. Use the berries as a trail marker.");
        int choice2 = choice.getChoice();
        switch (choice2) {
            case 3 -> choice.applyChoice(new RiskyChoice(-20));
            case 1 -> choice.applyChoice(new GoodChoice(10));
            default -> choice.applyChoice(new GoodChoice(5));
        }

        displayHealth();
        if (!choice.checkStatus()) return;

        // Level 3
        System.out.println("Level 3: It's nightfall and you're cold.");
        System.out.println("1. Sleep under leaves.");
        System.out.println("2. Try to build a fire.");
        System.out.println("3. Climb a tall tree.");
        int choice3 = choice.getChoice();
        switch (choice3) {
            case 1 -> choice.applyChoice(new GoodChoice(5));
            case 2 -> choice.applyChoice(new GoodChoice(10));
            default -> choice.applyChoice(new RiskyChoice(-30));
        }

        displayHealth();
        if (!choice.checkStatus()) return;

        // Level 4
        System.out.println("Level 4: You see an abandoned backpack near a bush.");
        System.out.println("1. Carefully check the backpack.");
        System.out.println("2. Kick it and run away.");
        System.out.println("3. Grab it and run fast.");
        int choice4 = choice.getChoice();
        switch (choice4) {
            case 3 -> choice.applyChoice(new RiskyChoice(-25));
            case 1 -> choice.applyChoice(new GoodChoice(8));
            default -> choice.applyChoice(new GoodChoice(5));
        }

        displayHealth();
        if (!choice.checkStatus()) return;

        // Level 5
        System.out.println("Level 5: You find a river blocking your path.");
        System.out.println("1. Swim across the river.");
        System.out.println("2. Walk along the river to find a shallow spot.");
        System.out.println("3. Build a small bridge with branches.");
        int choice5 = choice.getChoice();
        switch (choice5) {
            case 1 -> choice.applyChoice(new RiskyChoice(-35));
            case 3 -> choice.applyChoice(new GoodChoice(10));
            default -> choice.applyChoice(new GoodChoice(5));
        }

        displayHealth();
        if (!choice.checkStatus()) return;

        // Winning
        System.out.println("Congratulations! You survived the wilderness!");
    }
}