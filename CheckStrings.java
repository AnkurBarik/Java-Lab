class NoMatchFound extends Exception{
  String err;
  public NoMatchFound(String message){
    this.err=message;
  }
}

public class CheckStrings{
  public static void main(String[] args){
    try{
      String inputString = args[0];
      if (!inputString.equals("University")) {
        throw new NoMatchFound("String does not match 'University'");
      }
      System.out.println("String matches 'University'");
    } catch (NoMatchFound e) {
      System.out.println("Error: " + e.err); 
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Error: Please provide a string as input.");
    }
  }
}