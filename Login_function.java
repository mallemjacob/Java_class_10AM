import java.util.Scanner;

public class Login_function {
  public static void main(String[] args){
      check_login();
  }

  public static boolean check_username() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the username: ");
        String username = scanner.nextLine(); //admin
        if (username.equals("admin")) {
          return true;
        } else {
          return false;
        }
  }

  public static boolean check_password() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password: ");
        String password = scanner.nextLine(); //12345
        if (password.equals("12345")) {
            return true;
        } else {
          return false;
        }
  }


  public static void check_login(){
    while (true) { 
        if (check_username()) {
          System.out.println("Welcome admin");
          for (int i = 1; i < 4; i++) { // 1,2,3
              if (check_password()){
                System.out.println("Login Successful");
                break;
              } else {
                System.out.println("Wrong password");
            }  
          }
          break;
        } else {
        System.out.println("Invalid username");
      }
    }
  }


  // public static void check_attemps() {
    
  // }
}