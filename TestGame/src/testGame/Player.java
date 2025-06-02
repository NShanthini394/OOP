package testGame;

import java.util.Scanner;

public class Player {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Survival Game!");
        
        System.out.print("What is your name: ");
        String name = scanner.nextLine();
        
        System.out.println("\nGood luck, " + name + "!");

        Scenario scenario = new Scenario(name);
        scenario.playGame();
    }
}
