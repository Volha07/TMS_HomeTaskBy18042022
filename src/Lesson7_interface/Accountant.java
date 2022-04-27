package Lesson7_interface;

public class Accountant implements Printable{

    String position;

    Accountant(String name){

        this.position = name;
    }

    public void print() {

        System.out.printf("The position of the person is %s  \n", position);
    }
}
