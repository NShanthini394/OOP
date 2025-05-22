package testGame;

public class Game {
    private int health;

    public Game() {
        this.health = 50;
    }

    public void updateHealth(int change) {
        health += change;
        if (health < 0) health = 0;
        System.out.println("Updated Health: " + health);
    }

    public int getHealth() {
        return health;
    }

    public void displayHealth() {
        System.out.println("\n------ PLAYER HEALTH ------");
        System.out.println("Health: " + health);
        System.out.println("---------------------------\n");
    }

    public boolean isAlive() {
        return health > 0;
    }
}
