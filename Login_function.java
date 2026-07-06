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
                todo_list();
                add_new_items();
                break;
              } else {
                System.out.println("Wrong password");
                check_attempts(i);                
            }  
          }
          break;
        } else {
        System.out.println("Invalid username");
      }
    }
  }


  public static void check_attempts(Integer loop_number) {
      if (loop_number == 3){
          System.out.println("No more attempts left");
        } else if (loop_number >= 2) {
          System.out.println("Only " + (3 - loop_number) + " attempt left");
        } else {
          System.out.println("Only " + (3 - loop_number) + " attempts left");
    }
  }


  public static void todo_list() {
      String[] todo_items = {"buy fruits","learn Java","reapir mobile","travel","cook","workout"};

      System.out.println("--- Things to do in July 2026 ---");
      System.out.println(todo_items[0]);
      System.out.println(todo_items[1]);
      System.out.println(todo_items[2]);
      System.out.println(todo_items[3]);
      System.out.println(todo_items[4]);
      System.out.println(todo_items[5]);

  }

  public static void add_new_items() {
       String[] items = new String[5];

       Scanner scanner = new Scanner(System.in);

       System.out.println("Enter the index: ");
       int index = scanner.nextInt(); // 0

       System.out.println("Enter the todo item: ");
       String item = scanner.nextLine(); // travel

       items[index] = item;

       System.out.println("Item added");
       System.out.println(items[index]);

  }
}