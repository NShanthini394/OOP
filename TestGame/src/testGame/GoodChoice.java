package testGame;

import javax.swing.JOptionPane;

public class GoodChoice implements ChoiceType {

    private final int healthBoost;

    public GoodChoice(int healthBoost) {
        this.healthBoost = healthBoost;
    }

    @Override
    public void apply(Game game) {
        JOptionPane.showMessageDialog(null, "You make the right choice!\n"
                + "Health: " + healthBoost, "Risky Choice!", JOptionPane.INFORMATION_MESSAGE);
        game.updateHealth(healthBoost);
    }
}
