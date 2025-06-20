package testGame;

import javax.swing.JOptionPane;

public class RiskyChoice implements ChoiceType {

    private final int healthPenalty;

    public RiskyChoice(int healthPenalty) {
        this.healthPenalty = healthPenalty;
    }

    @Override
    public void apply(Game game) {
        JOptionPane.showMessageDialog(null, "That choice had serious consequences!\n"
                + "Health: " + healthPenalty, "Risky Choice!", JOptionPane.WARNING_MESSAGE);
        game.updateHealth(healthPenalty);
    }
}
