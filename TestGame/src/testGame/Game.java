package testGame;

public abstract class Game {
    private int health;

    public Game() {
        this.health = 50;
    }

    public void updateHealth(int change) {
        health += change;
        if (health < 0) health = 0;
    }

    public int getHealth() {
        return health;
    }

    public void displayHealth() {
        System.out.println("\n------ PLAYER HEALTH ------");
        System.out.println("Health: " + health);
        System.out.println("---------------------------");
    }

    public boolean isAlive() {
        return health > 0;
    }
    
    public void getGrade(){
        if(getHealth() > 90){
            System.out.println("\nOutstanding! You are a true survivor.");
            System.out.println("Your grade: A+");
        } else if (getHealth() > 80){
            System.out.println("\nNot bad, but you took some risks.");
            System.out.println("\nYour grade: A");
        }else if (getHealth() > 70){
            System.out.println("\nExcellent job! Almost perfect survival.");
            System.out.println("Your grade: A-");
        }else if (getHealth() > 60){
            System.out.println("\nGreat work! You made smart choices.");
            System.out.println("Your grade: B+");
        }else if (getHealth() > 50){
            System.out.println("\nYou did well. A few rough patches, but solid survival.");
            System.out.println("Your grade: B");
        }else if (getHealth() > 40){
            System.out.println("\nGood effort! You stayed strong.");
            System.out.println("Your grade: C+");
        }else if (getHealth() > 30){
            System.out.println("\nDecent performance. Try to be more careful next time.");
            System.out.println("Your grade: C");
        }else if (getHealth() > 20){
            System.out.println("\nNot bad, but you took some risks.");
            System.out.println("Your grade: D+");
        }else if (getHealth() > 10){
            System.out.println("\nYou are more capable than you think. Do not give up!");
            System.out.println("Your grade: D");
        }else if (getHealth() > 0){
            System.out.println("\nYou can do better than this! Survived by a thread.");
            System.out.println("Your grade: E");
        } else {
            System.out.println("\nYou didn’t make it. Time to reflect and retry!");
            System.out.println("Your grade: F");
        }
    }
    
    public abstract void playGame();
}
