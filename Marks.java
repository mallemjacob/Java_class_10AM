import java.util.Scanner;

public class Marks {
  public static void main(String[] args){

     Scanner scanner = new Scanner(System.in);

     System.out.println("Enter your marks: ");
     int student_marks = scanner.nextInt();

     if (student_marks >= 90){
        System.out.println("You got an A grade");
     } else if (student_marks >= 75 && student_marks < 90){
        System.out.println("You got a B grade");
     } else if (student_marks >= 50 && student_marks < 75){
        System.out.println("You got a C grade");
     } else {
        System.out.println("You got a D grade");
     }
  }
}
