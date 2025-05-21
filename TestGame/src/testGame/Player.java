
package testGame;

import java.util.Scanner;

public class Player {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
    
        // Invoked playGame Method
        Scenario scenario = new Scenario();
        scenario.playGame();
        
        //Invoked displayHealth and isAlive method
        Game game = new Game();
        game.displayHealth();
        game.isAlive();
  }
}