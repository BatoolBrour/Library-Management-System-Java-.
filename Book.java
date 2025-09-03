
public class Book {

    
     private int id ;
     private String title ;
     private String author ;
     private boolean isAvailable ;
  
public Book(int id , String title ,String author ){
    this.id=id;
    this.title=title;
    this.author=author;
    this.isAvailable =true;
}
   int getId(){return id ;} 
   String getTitle(){return title ;}
   String getAuthor(){return author ;}
   boolean getIsAvailable(){ return isAvailable ;}
   public void borrow(){
       if(isAvailable){
           isAvailable =false;
           System.out.println("The book has been borrowed successfuly ");
       }
       else 
           System.out.println("The book is not available right now");     
   } 
   public void returnBook(){
       isAvailable = true ;
       System.out.println(title+"has been returned ");
   }
   @Override 
   public String toString(){
       return "Book{"+
               "ID ="+id+
               ", Title ="+title+
               ", Author ="+author+
               ", isAvailable ="+isAvailable +
               "}";
   }
}
       

