class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Extends keyword is used to inherit the properties of the parent class.
class Student extends Person {
  int roll_no;

  Student(String name, int age, int roll_no){

    // Super keyword is used to call the constructor of the parent class
    super(name, age);
    this.roll_no = roll_no;    
  }

  void displayPerson() {
    System.out.println("The student details are:");
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
  }

  void displayStudent() {
        displayPerson();
        System.out.println("Roll number: " + roll_no);
    }    
}


class Inter_student extends Student {
  String course;

  Inter_student(String name, int age, int roll_no, String course) {
    super(name, age, roll_no);
    this.course = course;
  }

  void displayInterStudent() {
    displayStudent();
    System.out.println("Course: " + course);
  }
}



public class Main {
    public static void main(String[] args){

      Student student = new Student("John", 20, 101);
      student.displayStudent();
      
      System.out.println("------------");
      Inter_student interStudent = new Inter_student("Alice", 19, 102, "Computer Science");
      interStudent.displayInterStudent();
    }
  }