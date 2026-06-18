import java.util.Scanner;

public class Login {
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      while (true){
        System.out.println("Enter the username: ");
        String username = scanner.nextLine(); //admin
        if (username.equals("admin")) {
            System.out.println("Welcome admin");
            System.out.println("Enter the password: ");
            String password = scanner.nextLine(); //12345
            if (password.equals("12345")){
              System.out.println("Login successful");
              break;
            } else {
              System.out.println("Invalid password");
            }
        } else {
            System.out.println("Invalid username");
        }
      }
  }
}

// ask username
// if username is correct then only ask password
// if username is incorrect then print invalid username and ask for username again
// if password is correct then print login successful and exit the loop
// if password is incorrect then print invalid password and ask for username again