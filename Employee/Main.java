abstract class Employee {
  
  // Encapsulation: Private fields with public getters and setters
  private String name;
  private double salary;

  // Constructor
  public Employee(String name, double salary) {
    this.name = name;
    setSalary(salary); // Use setter to enforce validation
  }

  // Getter
  public String getName() {
    return name;
  }
  
  // Getter
  public double getSalary() {
      return salary;
    }

  // Setter
  public void setSalary(double salary) {
      if (salary >= 0) {
          this.salary = salary;
      } else {
          System.out.println("Salary cannot be negative.");
          this.salary = 0;
      }
  }

  // Abstraction: Abstract method to be implemented by subclasses
  public abstract void performWork();

  // Normal method
   public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Inheritance
class Developer extends Employee {

    // Fields, attributes
    private String programmingLanguage;

    // Constructor
    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void performWork() {
        System.out.println(
            getName() + " writes " + programmingLanguage + " code."
        );
    }
}

// Inheritance
class Tester extends Employee {

   // Constructor
    public Tester(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void performWork() {
        System.out.println(getName() + " tests the application.");
    }
}

public class Main {
    public static void main(String[] args) {

        // Runtime polymorphism
        Employee employee1 =
                new Developer("Anita", 60000, "Java");

        Employee employee2 =
                new Tester("Rahul", 50000);

        
        employee1.displayDetails();
        employee1.performWork();
        
        System.out.println("----------------");

        employee2.displayDetails();
        employee2.performWork();

        // Employee[] employees = {employee1, employee2};

        // for (Employee employee : employees) {
        //     employee.displayDetails();
        //     employee.performWork();
        //     System.out.println("----------------");
        // }
    }
}
