package day02;

public class Rectangle {

    private double aSide;
    private double bSide;

    public Rectangle(double aSide, double bSide) {
        this.aSide = aSide;
        this.bSide = bSide;
    }

    public double calculateArea() {
        return aSide * bSide;
    }

}
