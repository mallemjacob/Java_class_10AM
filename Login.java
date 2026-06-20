import java.util.Scanner;

public class Login {
  public static void main(String[] args){
      // start
      Scanner scanner = new Scanner(System.in);

      while (true){
        System.out.println("Enter the username: ");
        String username = scanner.nextLine(); //admin
        if (username.equals("admin")) {
            System.out.println("Welcome admin");

            // password
            for (int i = 1; i < 4; i++){
              System.out.println("Enter the password: ");
              String password = scanner.nextLine(); //12345
              if (password.equals("12345")){
                System.out.println("Login successful");
                break;
              } else {
                System.out.println("Invalid password");
                if (i == 3){
                  System.out.println("No more attempts left");
                } else if (i >= 2) {
                  System.out.println("Only " + (3 - i) + " attempt left");
                } else {
                  System.out.println("Only " + (3 - i) + " attempts left");
                }
              }
            }
            //password
            break;    
        } else {
            System.out.println("Invalid username");
        }
      }
      //end

      System.out.println("The end");
  }
}

// ask username
// if username is correct then only ask password
// if username is incorrect then print invalid username and ask for username again
// if password is correct then print login successful and exit the loop
// if password is incorrect then print invalid password and ask for username again


// total 3 chances
// 1 chance is completed
// 3 - 1 = 2 chances left
// 3 - 2 = 1 chance left


// problem solving - thinking, logic, reasoning

// aadhar card
// voter id
// guntur
// age > 18

// driving liecesnse