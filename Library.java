
import java.util.ArrayList;
public class Library {
    private ArrayList<Book> books ;
    private ArrayList<User> users ;
    
    public Library(){
        books=new ArrayList<>();
        users =new ArrayList<>();
    }
    public boolean addBook(Book b){
       return books.add(b);
    }
    public boolean addUser(User u ){
        return users.add(u);
    }
    public String searchBook(String title){
      
       for(Book b : books){
        if(b.getTitle().equalsIgnoreCase(title)){
            System.out.println("The book (" + title + ") found!");
            return b.toString();
        }
    }
    return "The book (" + title + ") not found!";
    }
    public void listIsAvailableBooks(){
     
    System.out.print("[");
    boolean first = true;
    for(Book b : books){
        if(b.getIsAvailable()){
            if(!first) System.out.print(", ");
            System.out.print(b);
            first = false;
        }
    }
    System.out.println("]");
}
    
    public void borrowBook(int userId , int bookId){
        User user = null;
        Book book = null;
        for(User u:users){
            if(u.getId()==userId){
                user =u;
                break;
            }
            }
         if(user==null){
             System.out.println("User not found!");
             return;
         }
       for(Book b :books){
          if(b.getId()==bookId){
              book =b ;
              break;
          }}
          if(book==null){
               System.out.println("Book not found !");
               return;
          }
       user.borrowBook(book);
         }
   }
