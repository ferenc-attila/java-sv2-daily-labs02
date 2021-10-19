package day02;

public class Geometry {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5.0,15.0);

        double area = rectangle.calculateArea();

        System.out.println(area);
    }
}
