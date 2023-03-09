package Inheritance_OptionalIndependentExercise;

public class TasteTester {

    public static void main(String[] args){
        Cake cake = new Cake("almond", 19.99);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: $" + cake.getPrice());


        BirthdayCake birthdayCake = new BirthdayCake();
        System.out.println("Birthday cake flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday cake price: $" + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("rum and coconut");
        weddingCake.setPrice(199.18);
        weddingCake.setTiers(5);
        System.out.println("Wedding cake flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding cake price: $" + weddingCake.getPrice());
        System.out.println("Wedding cake tiers: " + weddingCake.getTiers());


    }
}
