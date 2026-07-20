class Person {

    String name;
    int age;


    void introduce() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }

}

class Student extends Person {

    int rollNo;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative");
        } else {
            this.age = age;
        }
    }

    
    // // Constructor
    // Student(String n, int a) {
    //     this.name = n;
    //     this.age = a;
    //     System.out.println("Student object created");
    // }
}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Jake";

        s1.rollNo = 101;

        
        s1.setAge(1);

        System.out.println("Student name is: " + s1.name);
        System.out.println("Student age is: " + s1.getAge());
        System.out.println("Student age is: " + s1.rollNo);

        Student s2 = new Student();
        s2.name = "John";

        s2.rollNo = 102;

        s2.setAge(21);

        System.out.println("Student name is: " + s2.name);
        System.out.println("Student age is: " + s2.getAge());
        System.out.println("Student age is: " + s1.rollNo);

        System.out.println(" ---------------- ");   
        s1.introduce();
        s2.introduce();
    }

}


//  set value ---> age = 22
// set value ---> setAge(22) ---> age = 22