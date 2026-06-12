public class Greet {
  public static void main(String[] args) {
    // This is the starting point of the program
    int age = 10; 
    double PI = 3.14;

    System.out.println("Hello, World!");
    System.out.println("Welcome to Java programming.");
    
    System.out.println(100);

    System.out.println(age);

    System.out.println("Your age is: " + age);

    System.out.println("The value of PI is: " + PI);

    String fname = "John";
    String lname = "Doe";

    // String Operations
    System.out.println("Your name is: " + fname + " " + lname);


    // Arithmetic Operations
    System.out.println(1 + 1);
    System.out.println(1 - 1);
    System.out.println(1 * 1);
    System.out.println(1 / 1);
    System.out.println(1 % 1);

    System.out.println(1.1 + 1.1);
    System.out.println(1.1 - 1.1);
    System.out.println(1.1 * 1.1);
    System.out.println(1.1 / 1.1);
    System.out.println(1.1 % 1.1);


    // Character Operations
    char grade = 'A';
    System.out.println("Your grade is: " + grade);


    // Boolean Operations
    boolean is_eligible_to_vote = true;
    System.out.println("Are you eligible to vote? " + is_eligible_to_vote);

    // Comparison Operators
    System.out.println(5 > 3); // true
    System.out.println(5 < 3); // false
    System.out.println(5 == 5); // true
    System.out.println(5 != 3); // true

    System.out.println("mouse" == "mouse"); // true

    int age_of_mouse = 20;

    boolean is_eligible_to_vote2 = (age_of_mouse >= 18);

    System.out.println("Are you eligible to vote? " + is_eligible_to_vote2);
  } 
}