package activities;

//Abstract class Book
abstract class Book {
 String title;

 // Abstract method
 abstract void setTitle(String s);

 // Concrete method
 String getTitle() {
     return title;
 }
}

//MyBook class extends Book
class MyBook extends Book {
 // Implement abstract method
 void setTitle(String s) {
     this.title = s;
 }
}

//Main class
public class Activity5 {
 public static void main(String[] args) {
     // Create MyBook object
     MyBook newNovel = new MyBook();

     // Set book title
     newNovel.setTitle("A Journey to Java");

     // Print book title
     System.out.println("Book Title: " + newNovel.getTitle());
 }
}