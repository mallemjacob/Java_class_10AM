public class Functions {
  public static void main(String[] args){
    // function calling

    // Strings in brackets are arguments
    greet("Jake");
    greet("Manu");
    greet("David");
    greet("Eagle");

    adder(1, 2);
    adder(10, 20);
  }

  // function definition
  public static void greet(String name) { // name = parameter
      // function body
      System.out.println("Welcome " + name);
      System.out.println("Good morning " + name);
      System.out.println("Your name is " + name);
  }


  public static void adder(Integer num1, Integer num2) {
      System.out.println(num1 + num2);
  }
}

// We can reuse code with functions, ie deduplicate the code.



// System.out.println("Welcome Jake");
// System.out.println("Welcome Manu");
// System.out.println("Welcome John");
// System.out.println("Welcome David");