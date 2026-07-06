import java.util.Scanner;

class Student {

    String name;
    int age;

}

public class Main {

    public static void main(String[] args) {

        // Student 1
        // Student s1 = new Student();

        // s1.name = "Jake";
        // s1.age = 26;

        // System.out.println(s1.name);
        // System.out.println(s1.age);

        while (true) {
            Student s1 = new Student();

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the name: ");
            s1.name = scanner.nextLine();

            System.out.println("Enter the age: ");
            s1.age = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            System.out.println(s1.name);
            System.out.println(s1.age);

        }
    }

}