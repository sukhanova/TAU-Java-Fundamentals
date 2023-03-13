package chapter11.Farm_OptionalIndependentExercise;

public class Farm {

    public static void main(String[] args){
        Animal yellowDuck = new Duck();
        yellowDuck.makeSound();

        Duck donald = new Duck();
        donald.makeSound();
        donald.eat();

        Pig porky = new Pig();
        porky.makeSound();
        porky.eat();
    }
}
