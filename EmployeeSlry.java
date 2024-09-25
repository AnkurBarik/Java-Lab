class Employee{
  String Name;
  int employeeId;
  Employee(String Name, int employeeId){
    this.Name = Name;
    this.employeeId = employeeId;
  }
  double calculateSalary(){
    return 0;
  }
  double calculateSalary(double bonus){
    return  calculateSalary()+bonus;
  }
}

class FullTimeEmployee extends Employee{
  double monthlySalary;
  FullTimeEmployee(String Name, int employeeId, double monthlySalary){
    super(Name, employeeId); 
    this.monthlySalary = monthlySalary;
  }
  double calculateSalary(){
    return monthlySalary;
  }
}
class PartTimeEmployee extends Employee{
  double hourlyRate;
  int hoursWorked;
  PartTimeEmployee(String Name, int employeeId, double hourlyRate, int hoursWorked){
    super(Name, employeeId);
    this.hourlyRate = hourlyRate;
    this.hoursWorked = hoursWorked;
  }
  double calculateSalary(){
    return hourlyRate * hoursWorked;
  }
}
public class EmployeeSlry{
  public static void main(String[] args){
    FullTimeEmployee fte = new FullTimeEmployee("Rudra", 1978, 1000);
    PartTimeEmployee pte = new PartTimeEmployee("Sayan", 1543, 100, 10);
    System.out.println("Full Time Employee Name: " + fte.Name + ", Employee ID: " + fte.employeeId+", "+fte.Name+"'s Salary: " + fte.calculateSalary());
    System.out.println("Part Time Employee Name: " + pte.Name + ", Employee ID: " + pte.employeeId+", "+pte.Name+"'s Salary: " + pte.calculateSalary());
  }
}