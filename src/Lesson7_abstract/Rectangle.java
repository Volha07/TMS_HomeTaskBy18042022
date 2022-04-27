package Lesson7_abstract;

public class Rectangle extends Figure {

    private double a;
    private double b;

    Rectangle(double a, double b){

        this.a = a;
        this.b = b;
    }

    public String getName()
    {
        return "This is Rectangle.";
    }

    public double getPerimeter(){

        return a * 2 + b * 2;
    }

    public double getArea(){

        return a * b;
    }

}
