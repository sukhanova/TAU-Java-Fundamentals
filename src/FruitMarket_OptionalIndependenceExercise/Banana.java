package FruitMarket_OptionalIndependenceExercise;

public class Banana extends Fruit{

    public void Banana(){
        setCalories(170);
    }

    public void peel(){
        System.out.println("Banana has been peeled");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana juice is gross");
    }
}
