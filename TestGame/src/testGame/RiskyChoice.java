package testGame;

public class RiskyChoice implements ChoiceType {
    private final int healthPenalty;

    public RiskyChoice(int healthPenalty) {
        this.healthPenalty = healthPenalty;
    }

    @Override
    public void apply(Game game) {
        System.out.println("\nThat choice had serious consequences!");
        System.out.println("Health: " + healthPenalty);
        game.updateHealth(healthPenalty);
    }
}