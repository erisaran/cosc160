/** Bookshop App
  * lab 6
  * displays info for books
  */

public class BookShopApp {
  
  public static void main (String[] args){
    Book b1 = new Book(); // create book 1 instance
    b1.setTitle("Life of Pi"); //sets title
    b1.setPages(348); //sets pages
    b1.setPrice(28.90); //sets price
    
    Book b2 = new Book(); // create book 2 instance
    b2.setTitle("Mister Pip"); //sets title
    b2.setPages(240); //sets pages
    b2.setPrice(22.70); //sets price
    
    Book b3 = new Book(); // create book 3 instance
    b3.setTitle("No Title"); //sets title
    b3.setPages(131); //sets pages
    b3.setPrice(19.99); //sets price
    
    b1.displayBook(); // prints out book 1
    b2.displayBook(); // prints out book 2
    b3.displayBook(); // prints out book 3
    
  }//end main method
  
}//end class