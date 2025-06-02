package testGame;

public class GoodChoice implements ChoiceType {
    private final int healthBoost;

    public GoodChoice(int healthBoost) {
        this.healthBoost = healthBoost;
    }

    @Override
    public void apply(Game game) {
        System.out.println("\nYou make the right choice!");
        System.out.println("Health: +" + healthBoost);
        game.updateHealth(healthBoost);
    }
}