public class Functions {
  public static void main(String[] args){
    // function calling

    // Strings in brackets are arguments
    String result = greet("Jake");
    System.out.println(result);

    adder(1, 2);
    adder(10, 20);

    student("Jake", 26);

    System.out.println(add(3,6));

  }

  // function definition
  public static String greet(String name) { // name = "Jake"
      // function body
      return "Welcome " + name + " Good morning " + name + " Your name is " + name;
  }

  public static int add(int a, int b) {

    return a + b;

}


  public static void adder(Integer num1, Integer num2) {
      System.out.println(num1 + num2);
  }

  public static void student(String name, int age) {

    System.out.println(name);
    System.out.println(age);

}

}

// We can reuse code with functions, ie deduplicate the code.



// System.out.println("Welcome Jake");
// System.out.println("Welcome Manu");
// System.out.println("Welcome John");
// System.out.println("Welcome David");