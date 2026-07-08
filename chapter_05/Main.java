class Student {

    String name;
    private int age;

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
        
        
        s1.setAge(1);

        System.out.println("Student name is: " + s1.name);
        System.out.println("Student age is: " + s1.getAge());

        Student s2 = new Student();
        s2.name = "John";

        s2.setAge(21);

        System.out.println("Student name is: " + s2.name);
        System.out.println("Student age is: " + s2.getAge());

    }

}