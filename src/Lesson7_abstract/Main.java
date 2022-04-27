package Lesson7_abstract;

public class Main {
    public static void main(String[] args) {

//        Rectangle rectangle = new Rectangle(10.0, 10.0);
//
//        System.out.println(rectangle.getName());
//        System.out.println(rectangle.getArea());
//        System.out.println(rectangle.getPerimeter());
//
//
//        Triangle triangle = new Triangle(10.0, 10.0, 10.0);
//
//        System.out.println(triangle.getName());
//        System.out.println(triangle.getArea());
//        System.out.println(triangle.getPerimeter());
//
//
//        Circle circle = new Circle(10.0);
//
//        System.out.println(circle.getName());
//        System.out.println(circle.getArea());
//        System.out.println(circle.getPerimeter());
//
//    }

            Figure[] figure = new Figure[5];
            figure[0] = new Rectangle(24.2, 8.3);
            figure[1] = new Triangle(10.4, 6.1, 8.9);
            figure[2] = new Triangle(7.0, 6.1, 18.2);
            figure[3] = new Circle(2.3);
            figure[4] = new Rectangle(5.0, 2.1);


            for (int i = 0; i < figure.length; i++) {
                double p1 = 0;
                double p2 = 0;
                double p3 = 0;
                double p4 = 0;
                double p5 = 0;
                double result = 0;

                if (i == 0) {
                    p1 = figure[i].getPerimeter();
                    System.out.println("Perimeter: " + p1);
                } else if (i == 1) {
                    p2 = figure[i].getPerimeter();
                    System.out.println("Perimeter: " + p2);
                } else if (i == 2) {
                    p3 = figure[i].getPerimeter();
                    System.out.println("Perimeter: " + p3);
                } else if (i == 3) {
                    p4 = figure[i].getPerimeter();
                    System.out.println("Perimeter: " + p4);
                } else if (i == 4) {
                    p5 = figure[i].getPerimeter();
                    System.out.println("Perimeter: " + p5);
//                } else  if(i == 5){
                    result = p1 + p2 + p3 + p4 + p5;
                    System.out.println("Sum of perimeter: " + result);
                } //сумма не вычисляется
        }
    }
}
