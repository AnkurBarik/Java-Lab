class Staff{
  String code, name;
  Staff(String code, String name){
    this.code = code;
    this.name = name;
  }
}

class Teacher extends Staff{
  String subject, publication;
  Teacher(String code, String name, String subject, String publication){
    super(code, name);
    this.subject = subject;
    this.publication = publication;
  }
}

class Officer extends Staff{
  String grade;
  Officer(String code, String name, String grade){
    super(code, name);
    this.grade = grade;
  }
}

class Typist extends Staff{
  int speed;
  Typist(String code, String name, int speed){
    super(code, name);
    this.speed = speed;
  }
}

class RegularTypist extends Typist{
  int dailyWages;
  RegularTypist(String code, String name, int speed, int dailyWages){
    super(code, name, speed);
    this.dailyWages = dailyWages;
  }
}

class CasualTypist extends Typist{
  int dailyWages;
  CasualTypist(String code, String name, int speed, int dailyWages){
    super(code, name, speed);
    this.dailyWages = dailyWages;
  }
}
 