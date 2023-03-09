package Inheritance_OptionalIndependentExercise;

public class BirthdayCake extends Cake{
    private int candles;

    public BirthdayCake(){
        super("vanilla", 15.99);
    }
    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }


}
