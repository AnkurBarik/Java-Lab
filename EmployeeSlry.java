import java.util.*;
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
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the full time employee name: ");
    String Name = sc.nextLine();
    System.out.print("Enter "+Name+"'s employee ID: ");
    int employeeId = sc.nextInt();
    System.out.print("Enter "+Name+"'s monthly salary: ");
    double monthlySalary = sc.nextDouble();
    FullTimeEmployee fte = new FullTimeEmployee(Name, employeeId, monthlySalary);
    System.out.println("Full Time Employee Name: " + fte.Name + ", Employee ID: " + fte.employeeId+", "+fte.Name+"'s Salary: " + fte.calculateSalary());
    System.out.println("\nEnter the part time employee name: ");
    String Name2 = sc.nextLine();
    System.out.println("Enter "+Name2+"'s employee ID: ");
    int employeeId2 = sc.nextInt();
    System.out.println("Enter "+Name2+"'s monthly salary: ");
    double monthlySalary2 = sc.nextDouble();
    System.out.println("Enter "+Name2+"'s work hour: ");
    int hoursWorked = sc.nextInt();
    PartTimeEmployee pte = new PartTimeEmployee(Name2, employeeId2, monthlySalary2, hoursWorked);
    System.out.println("Part Time Employee Name: " + pte.Name + ", Employee ID: " + pte.employeeId+", "+pte.Name+"'s Salary: " + pte.calculateSalary()+pte.Name+" has hours worked: "+pte.hoursWorked);
  }
}