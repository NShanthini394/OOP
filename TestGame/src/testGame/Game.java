package testGame;

import javax.swing.JOptionPane;

public abstract class Game {

    private int health;
    private String title = "Survival Results";
    private String grade;
    private String message;

    public Game() {
        this.health = 50;
    }

    public void updateHealth(int change) {
        health += change;
        if (health < 0) {
            health = 0;
        }
    }

    public int getHealth() {
        return health;
    }

    public void displayHealth() {
        JOptionPane.showMessageDialog(null, "------ PLAYER HEALTH ------\n"
                + "Health: " + health
                + "\n---------------------------------------", "Health", JOptionPane.PLAIN_MESSAGE);
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void getGrade() {
        if (health > 90) {
            grade = "A+";
            message = "Outstanding! You are a true survivor.";
        } else if (health > 80) {
            grade = "A";
            message = "Excellent job! You handled challenges well.";
        } else if (health > 70) {
            grade = "A-";
            message = "Great survival skills! Just a few missteps.";
        } else if (health > 60) {
            grade = "B+";
            message = "Smart choices kept you going strong.";
        } else if (health > 50) {
            grade = "B";
            message = "Solid effort! A few rough patches, but you made it.";
        } else if (health > 40) {
            grade = "C+";
            message = "Good effort! You stayed strong despite difficulties.";
        } else if (health > 30) {
            grade = "C";
            message = "Decent survival, but there's room for better decisions.";
        } else if (health > 20) {
            grade = "D+";
            message = "Not bad, but try to be more cautious next time.";
        } else if (health > 10) {
            grade = "D";
            message = "You’re more capable than you think. Don’t give up!";
        } else if (health > 0) {
            grade = "E";
            message = "Barely survived. Reflect and prepare better next time.";
        } else {
            grade = "F";
            message = "You didn’t make it. But failure is the first step to success.";
        }

        JOptionPane.showMessageDialog(null,
                message + "\nYour grade: " + grade,
                title,
                JOptionPane.INFORMATION_MESSAGE);
    }

    public abstract void playGame();
}
