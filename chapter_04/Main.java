
class Student {
    String name;
    int age;
}

class Book {
    String title;
    String author;
    int pages;
}


public class Main {
    public static void main(String[] args){

        Student s1 = new Student();
        s1.name = "Jake";
        s1.age = 26;

        Student s2 = new Student();
        s2.name = "John";
        s2.age = 30;


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


        Book b1 = new Book();
        b1.title = "The Great Gatsby";
        b1.author = "F. Scott Fitzgerald";
        b1.pages = 180;

        Book b2 = new Book();
        b2.title = "To Kill a Mockingbird";
        b2.author = "Harper Lee";
        b2.pages = 281;
    }
}