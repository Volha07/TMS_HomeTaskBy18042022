package Lesson7_abstract;

public class Triangle extends Figure{
    private double a;
    private double b;
    private double c;

    Triangle(double a, double b, double c){

        this.a = a;
        this.b = b;
        this.c = c;

    }

    public String getName()
    {
        return "This is Triangle.";
    }

    public double getPerimeter(){

        return a + b + c;
    }

    public double getArea(){

        double p = (a+b+c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
