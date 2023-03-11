package FruitMarket_OptionalIndependenceExercise;

public class Market {

    public static void main(String[] args){
        Fruit appleGrannySmith = new Apple();
        ((Apple) appleGrannySmith).removeSeeds();

        Apple appleHoneyCrisp = new Apple();
        appleHoneyCrisp.removeSeeds();

        Banana banana = new Banana();
        banana.peel();

        Fruit bananaMini = new Banana();
        ((Banana) bananaMini).peel();

        Fruit orange = new Fruit();

        squeeze(appleGrannySmith);
        squeeze(banana);
        squeeze(bananaMini);
        squeeze(orange);

    }

    public static void squeeze(Fruit fruit){
        System.out.print("Squeezing...");
        fruit.makeJuice();
    }
}
