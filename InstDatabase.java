class Staff{
  String code, name;
  Staff(String code, String name){
    this.code = code;
    this.name = name;
  }
  void display(){
    System.out.println("Staff Code: " + code);
    System.out.println("Staff Name: " + name);
  }
}

class Teacher extends Staff{
  String subject, publication;
  Teacher(String code, String name, String subject, String publication){
    super(code, name);
    this.subject = subject;
    this.publication = publication;
  }
  void display(){
    super.display();
    System.out.println("Subject: " + subject);
    System.out.println("Publication: " + publication);
  }
}

class Officer extends Staff{
  String grade;
  Officer(String code, String name, String grade){
    super(code, name);
    this.grade = grade;
  }
  void display(){
    super.display();
    System.out.println("Grade: " + grade);
  }
}

class Typist extends Staff{
  int speed;
  Typist(String code, String name, int speed){
    super(code, name);
    this.speed = speed;
  }
  void display(){
    super.display();
    System.out.println("Speed: " + speed);
  }
}

class RegularTypist extends Typist{
  int remuneration;
  RegularTypist(String code, String name, int speed, int remuneration){
    super(code, name, speed);
    this.remuneration = remuneration;
  }
  void display(){
    super.display();
    System.out.println("Remuneration: " + remuneration);
  }
}

class CasualTypist extends Typist{
  int dailyWages;
  CasualTypist(String code, String name, int speed, int dailyWages){
    super(code, name, speed);
    this.dailyWages = dailyWages;
  }
  void display(){
    super.display();
    System.out.println("Daily Wages: " + dailyWages);
  }
}

public class InstDatabase {
  public static void main(String[] args){
    Teacher t = new Teacher("T001", "Ankur", "Maths", "IEEE");
    Officer o = new Officer("O001", "Sayan", "A");
    RegularTypist rt = new RegularTypist("RT001", "Sayan", 100, 1000);
    CasualTypist ct = new CasualTypist("CT001", "Sayan", 100, 100);
    t.display();
    o.display();
    rt.display();
    ct.display();
  }
}