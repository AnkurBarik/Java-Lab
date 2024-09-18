
class Appliance{
  void operate(){
    System.out.println("Inside Superclass Appliance");
  }
}

class WashingMachines extends Appliance{
  void operate(){
    System.out.println("Inside Superclass WashingMachines");
  }
}

class Refrigerator extends Appliance{
  void operate(){
    System.out.println("Inside Superclass Refrigerator");
  }
}

public class HomeAppliance{
  public static void main(String[] args){
    Appliance app = new Appliance();
    app.operate();
    WashingMachines wash = new WashingMachines();
    wash.operate();
    Refrigerator ref = new Refrigerator();
    ref.operate();
  }
}
