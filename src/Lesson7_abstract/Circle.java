package Lesson7_abstract;

public class Circle extends Figure{

    private double r;

    Circle(double r){

        this.r = r;
    }

    public String getName()
    {
        return "This is Circle.";
    }

    public double getPerimeter(){

        return 2*Math.PI*r;
    }

    public double getArea(){

        return Math.PI*r*r;
    }
}
