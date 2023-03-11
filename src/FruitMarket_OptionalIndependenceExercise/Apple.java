package FruitMarket_OptionalIndependenceExercise;

public class Apple extends Fruit{

    public Apple(){
        setCalories(85);
    }

    public void removeSeeds(){
        System.out.println("Apple seed removed");
    }

    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made!");
    }


}
