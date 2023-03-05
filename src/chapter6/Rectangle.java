package chapter6;

public class Rectangle {
    private double length;
    private double width;

    //constructor
//    public Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }

    /*
    * Using Multiple Constructors
    * You can have however many constructors you want.
    * All of their names must be exactly as the class name. What differs is the parameters that they accept.
    */

    public Rectangle(double length, double width){
        this.length = length; //can be set this way
        setWidth(width); //or can be set this way. these are only different here to demo alternative options
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    double calculateArea(){
        return length * width;
    }
}
