import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
class Book{
  private String title, author;
  public Book(String title, String author){
    this.title=title;
    this.author=author;
  }
}
public class BookHash{
  public static void main(String[] args){
    Set <Book> bookSet = new HashSet<>();
  }
}