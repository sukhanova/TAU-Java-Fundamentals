package chapter6;

/*
 * Write a class that creates instances of the `Rectangle` class to find the
 * total area of two rooms in a house.
 */

public class HomeAreaCalculator {

    public static void main(String args[]){

        /*******************
         * RECTANGLE 1
         ********************/

        //Create an instance of the Rectangle class
        Rectangle room1 = new Rectangle(50,25);
        double areaOfRoom1 = room1.calculateArea();

        /*******************
         * RECTANGLE 1
         ********************/
        Rectangle room2 = new Rectangle(30, 75);
        double arearOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + arearOfRoom2;
        System.out.println("Are of rooms: "+ totalArea);

    }
}
