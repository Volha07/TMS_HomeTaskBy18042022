package Lesson8;

public class Magazine implements Printable {

        private String title;

        String getName(){
            return title;
        }

        Magazine(String title){
            this.title = title;
        }
        public void print() {
            System.out.println(title);
        }
}