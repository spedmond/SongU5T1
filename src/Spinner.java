public class Spinner {
    private int sect;
    private int spinCount;
    private int spinSum;
    private int spinValue;

    public Spinner(int sect) {
        this.sect = sect;
    }

    public void spin() {
        spinValue = (int)(Math.random()*sect)+1;
        spinCount++;
        spinSum+=spinValue;
    }

    public int getSpinValue() {
        return spinValue;
    }

    public int getSpinSum() {
        return spinSum;
    }

    public int getSpinCount() {
        return spinCount;
    }

    public double averageSpin() {
        return (double)spinSum/spinCount;
    }
}
