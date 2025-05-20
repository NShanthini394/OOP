package testGame;

public class Game {
    protected int health;

    public Game() {
        this.health = 100;
    }

    public void updateHealth(int change) {
        health += change;
        if (health < 0) health = 0;
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
