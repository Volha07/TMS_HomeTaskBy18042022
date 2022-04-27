package Lesson8;

public class Book implements Printable {

    String title;

    Book(String name){

        this.title = name;
    }

    public void print() {

        System.out.printf("The title of the book is %s  \n", title);
    }
}