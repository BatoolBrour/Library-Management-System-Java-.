
public class Main {
    public static void main(String[] args) {
        
        
         // Write your own code here by calling methods ,...
         //for example : 
         
        Book book1 =new Book(1234,"Chem","arnold");
        Book book2 =new Book(2563,"Black angle ","carees");
        User user = new User(20010457,"Jane");
        user.borrowBook(book2);
        System.out.println(user.toString()); ;
        user.returnBook(book2);
        System.out.println(user.toString());
        
                
    }
}
