package week_5Tutorial;
interface Employee {
 void printEmployeeId();
 void printSalary();
}


class Manager implements Employee {
 int id = 101;
 double salary = 50000;

 public void printEmployeeId() {
     System.out.println("Manager ID: " + id);
 }

 public void printSalary() {
     System.out.println("Manager Salary: $" + salary);
 }
}


class Developer implements Employee {
 int id = 201;
 double salary = 40000;

 public void printEmployeeId() {
     System.out.println("Developer ID: " + id);
 }

 public void printSalary() {
     System.out.println("Developer Salary: $" + salary);
 }
}



