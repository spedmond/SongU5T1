public class DiceRunner {
    public static void main(String[] args) {
        Dice d1 = new Dice();
        Dice d2 = new Dice(3);

        System.out.println("Dice 1");
        for (int i=1;i<=10;i++) {
            d1.rollDice();
            System.out.print(d1.getRollValue() + " ");
        }
        System.out.println();
        System.out.println("Dice sides: " + d1.getSides());
        System.out.println("Times rolled: " + d1.getTimesRolled());
        System.out.println();

        System.out.println("Dice 2");
        for (int i=1;i<=10;i++) {
            d2.rollDice();
            System.out.print(d2.getRollValue() + " ");
        }
        System.out.println();
        System.out.println("Dice sides: " + d2.getSides());
        System.out.println("Times rolled: " + d2.getTimesRolled());
        System.out.println();

        d2.setSides(10);
        System.out.println("Dice 2 (New number of sides)");
        for (int i=1;i<=10;i++) {
            d2.rollDice();
            System.out.print(d2.getRollValue() + " ");
        }
        System.out.println();
        System.out.println("Dice sides: " + d2.getSides());
        System.out.println("Times rolled: " + d2.getTimesRolled());
    }
}
