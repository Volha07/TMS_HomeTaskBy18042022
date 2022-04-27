package Lesson7_interface;

public class Director implements Printable{

    String position;

    Director(String position){

        this.position = position;
    }

    public void print() {

        System.out.printf("The position of the person is %s  \n", position);
    }
}