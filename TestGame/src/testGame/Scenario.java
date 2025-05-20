package testGame;

import java.util.Scanner;
import java.util.Random;

public class Scenario extends Game {
    private Scanner scanner = new Scanner(System.in);
    private Random random = new Random();

    public void playGame() {
        System.out.println("Welcome to the Survival Game!");

        // LEVEL 1
        displayHealth();
        System.out.println("Level 1: You wake up in a dense jungle. It's raining heavily.");
        System.out.println("1. Explore deeper into the jungle.");
        System.out.println("2. Hide under a tree.");
        System.out.println("3. Climb a tree to get a better view.");
        int choice1 = getChoice();
        
        switch (choice1) {
            case 1 -> riskyChoice(-25);   // risky
            case 2 -> updateHealth(10);
            default -> updateHealth(5);
        }
        if (!checkStatus()) return;

        // LEVEL 2
        displayHealth();
        System.out.println("Level 2: You are hungry and find strange berries.");
        System.out.println("1. Eat the berries.");
        System.out.println("2. Skip the berries and keep walking.");
        System.out.println("3. Use the berries as a trail marker.");
        int choice2 = getChoice();
        
        switch (choice2) {
            case 3 -> riskyChoice(-20);   // risky
            case 1 -> updateHealth(10);
            default -> updateHealth(5);
        }
        if (!checkStatus()) return;

        // LEVEL 3
        displayHealth();
        System.out.println("Level 3: It's nightfall and you're cold.");
        System.out.println("1. Sleep under leaves.");
        System.out.println("2. Try to build a fire.");
        System.out.println("3. Climb a tall tree.");
        int choice3 = getChoice();
        
        switch (choice3) {
            case 1 -> updateHealth(5);
            case 2 -> updateHealth(10);
            default -> riskyChoice(-30);   // risky
        }
        if (!checkStatus()) return;

        // LEVEL 4
        displayHealth();
        System.out.println("Level 4: You see an abandoned backpack near a bush.");
        System.out.println("1. Carefully check the backpack.");
        System.out.println("2. Kick it and run away.");
        System.out.println("3. Grab it and run fast.");
        int choice4 = getChoice();
        
        switch (choice4) {
            case 3 -> riskyChoice(-25);   // risky
            case 1 -> updateHealth(8);
            default -> updateHealth(5);
        }
        if (!checkStatus()) return;

        // LEVEL 5
        displayHealth();
        System.out.println("Level 5: You find a river blocking your path.");
        System.out.println("1. Swim across the river.");
        System.out.println("2. Walk along the river to find a shallow spot.");
        System.out.println("3. Build a small bridge with branches.");
        int choice5 = getChoice();
        
        switch (choice5) {
            case 1 -> riskyChoice(-35);   // risky
            case 3 -> updateHealth(10);
            default -> updateHealth(5);
        }
        if (!checkStatus()) return;

        // WINNING
        displayHealth();
        System.out.println("Congratulations! You survived the wilderness!");
    }

    private int getChoice() {
        int choice;
        do {
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();
        } while (choice < 1 || choice > 3);
        return choice;
    }

    private void riskyChoice(int damage) {
        System.out.println("That decision had serious consequences!");
        updateHealth(damage);
    }

    private boolean checkStatus() {
        if (!isAlive()) {
            System.out.println("\nYou have lost all your health. Game Over.");
            return false;
        }
        return true;
    }
}
