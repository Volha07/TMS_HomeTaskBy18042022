package Lesson7_interface;

public class Main {

    public static void main(String[] args){

        Printable printable = new Director("Director");
        printable.print();

//        Printable printable = new Employee("Employee");
//        printable.print();
//
//        Printable printable = new Accountant("Accountant");
//        printable.print();
    }
}
