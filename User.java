import java.util.ArrayList;
public class User {
      private int id ;
      private String name ;
      private ArrayList<Book> borrowedBooks ;
      
      public User(int id , String name ){
          this.id =id ;
          this.name =name ;
          borrowedBooks =new ArrayList<>();
      }
     public int getId(){return id ;}
     public String getName(){ return name;}
     public ArrayList<Book> getBorrowedBooks(){ return borrowedBooks ;}
      
      public void borrowBook(Book b){
          if(b.getIsAvailable()){
              b.borrow();
              borrowedBooks.add(b);
          }
          else 
              b.borrow();
      }
      public void returnBook(Book b){
          if(borrowedBooks.contains(b)){
              b.returnBook();
              borrowedBooks.remove(b);
          }
          else 
              System.out.println("You hav not borrowed this book !");
      }
      @Override
      public String toString(){
          return "User{ID = "+id+
                  ", Name = "+name +
                  ", Borrowed books = "+borrowedBooks+"}";
      }
}
