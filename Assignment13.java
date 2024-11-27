import java.util.Map;
import java.util.HashMap;

public class Assignment13{
  public record Employee(int id, String name, String department) {}

  private Map<Integer, Employee> employeeMap;

  public Assignment13(){
    employeeMap = new HashMap<>();
  }

  public void addEmployee(Employee employee){
    employeeMap.put(employee.id(), employee);
  }

  public Employee getEmployee(int id){
    return employeeMap.get(id);
  }

  public boolean updateEmployee(int id, String newDepartment){
    Employee employee = employeeMap.get(id);
    if (employee != null) { // Check if the employee exists
      Employee updateEmployee = new Employee(employee.id(), employee.name(), newDepartment);
      employeeMap.put(id, updateEmployee);
      return true; // Return true if the update was successful
    }
    return false; // Return false if the employee was not found
  }

  public static void main(String[] args){
    Assignment13 assignment13 = new Assignment13();
    assignment13.addEmployee(new Employee(055, "Ankur", "BCA"));
    assignment13.addEmployee(new Employee(042, "Sayan", "BCA"));

    System.out.println(assignment13.getEmployee(055));

    boolean updated = assignment13.updateEmployee(055, "MCA");
    if(updated){
      System.out.println("Employee updated successfully");
    }
    else{
      System.out.println("Employee not found");
    }
  }
}