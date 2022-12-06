public class Dice {
    private int sides;
    private int timesRolled;
    private int rollValue;

    public Dice() {
        sides = 6;
    }

    public Dice(int sides) {
        this.sides = sides;
    }

    public int getTimesRolled() {
        return timesRolled;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getRollValue() {
        return rollValue;
    }

    public int getSides() {
        return sides;
    }

    public void rollDice() {
        rollValue = (int)(Math.random()*sides)+1;
        timesRolled++;
    }
}
