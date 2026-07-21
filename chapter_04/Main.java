
class Student {
    String name;

    // private variable - hide data
    private int age;

    // getter method - gives controlled access to the private variable
    public int getAge() {
        return age;
    }

    //  setter method - gives controlled access to the private variable
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cannot be negative");
        } else {
            this.age = age;
        }
    }
}


class InterStudent extends Student{
   
    String inter_student_board;

}


class tenthStudent extends Student{
   
    String tenth_student_board;

}

// class Book {
//     String title;
//     String author;
//     int pages;
// }


public class Main {
    public static void main(String[] args){

        Student s1 = new Student(); // instance of Student class
        s1.name = "Jake";
        
        s1.setAge(20);

        System.out.println("Student name is: " + s1.name);
        System.out.println("Student age is: " + s1.getAge());

        ////////////////////////////////////////////////////
        // InterStudent details

        InterStudent is1 = new InterStudent();
         
        is1.name = "John";
        System.out.println("InterStudent name is: " + is1.name);
        is1.setAge(21);
        System.out.println("InterStudent age is: " + is1.getAge());

        is1.inter_student_board = "CBSE";
        System.out.println("InterStudent board is: " + is1.inter_student_board);


         ////////////////////////////////////////////////////
        // InterStudent details

        tenthStudent ts1 = new tenthStudent();
        ts1.tenth_student_board = "ICSE";
        System.out.println("tenthStudent board is: " + ts1.tenth_student_board);
        ts1.name = "Smith";
        System.out.println("tenthStudent name is: " + ts1.name);
    }

        // Student s2 = new Student();
        // s2.name = "John";
        // s2.age = 30;


        // for (int i = 0; i < 10; i++){
        //     Student s = new Student();
        //     Scanner scanner = new Scanner(System.in);

        //     System.out.println("Enter the student name: ");
        //     s.name = scanner.nextLine();
        //     System.out.println("Enter the student age: ");
        //     s.age = scanner.nextInt();

        //     System.out.println("Student name is: " + s.name);
        //     System.out.println("Student age is: " + s.age);
        // }

        // System.out.println("Student name is: " + s1.name);
        // System.out.println("Student age is: " + s1.age);

        // System.out.println("Student name is: " + s2.name);
        // System.out.println("Student age is: " + s2.age);


        // Book b1 = new Book();
        // b1.title = "The Great Gatsby";
        // b1.author = "F. Scott Fitzgerald";
        // b1.pages = 180;

        // Book b2 = new Book();
        // b2.title = "To Kill a Mockingbird";
        // b2.author = "Harper Lee";
        // b2.pages = 281;
    }


