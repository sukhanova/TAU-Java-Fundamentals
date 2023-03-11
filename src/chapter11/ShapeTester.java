package chapter11;

public class ShapeTester {

    public void main(String[] args){
        Shape rectangle = new Rectangle(5, 7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }


}
