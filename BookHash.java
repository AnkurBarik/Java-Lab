import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
class Book{
  private String title, author;
  public Book(String title, String author){
    this.title=title;
    this.author=author;
  }
  public String toString(){
    return ("Title: "+title+" Author: "+author);
  }

  public boolean equals(Object o){
    if(this==o)
      return true;
    if(o==null || getClass()!=o.getClass())
      return false;

    Book book = (Book)o;
    return Objects.equals(title, book.title) && Objects.equals(author, book.author);
  }
  public int hashCode(){
    return Objects.hash(title, author);
  }
}
public class BookHash{
  public static void main(String[] args){
    Set <Book> bookSet = new HashSet<>();
    bookSet.add(new Book("Book1", "Author1"));
    bookSet.add(new Book("Book2", "Author2"));
    bookSet.add(new Book("Book3", "Author3"));
    bookSet.add(new Book("Book1", "Author1"));
    bookSet.add(new Book("Book2", "Author2"));
    for (Book book : bookSet){
      System.out.println(book);
    }
  }
}