interface Exam{
  void percent_cal();
}
class Student{
  String name;
  int roll_no;
  Student(String name, int roll_no){
    this.name = name;
    this.roll_no = roll_no;
  }
  void show(){
    System.out.println("Name: " + name);
    System.out.println("Roll No: " + roll_no);
  }
}

public class Result extends Student implements Exam{
  double marks;
  Result(String name, int roll_no, int marks){
    super(name, roll_no);
    this.marks = marks;
  }
  void show(){
    super.show();
    System.out.println("Marks: " + marks);
  }
  public void percent_cal(){
    double percent = (marks/700)*100;
    System.out.println("Percentage: " + percent);
  }
  public static void main(String[] args){
    Result r = new Result("Ankur", 055, 513);
    r.show();
    r.percent_cal();
  }
}