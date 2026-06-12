import java.util.Scanner; 



public class Vote {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter your age: ");

    int age = scanner.nextInt(); //30

    boolean is_eligible_to_vote = (age >= 18);
    System.out.println("Are you eligible to vote? " + is_eligible_to_vote);
  }
}