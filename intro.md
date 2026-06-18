# Java Programming Language

## Language

1 + 1
distance between guntur and vijayawada

communication between human beings
Ex: Telugu, English, German, French

## Programming Language

communication between humans and computers
Ex: Python, Java, Javascript

## Java Programming Language

develop software
games
web developement
enterprise software

## To run java in our computer

1. Java software - jdk - java development kit
2. Vscode

We write code in Vscode text editor ---> JDK run the code ---> Produces Output

1. Write code in a file with .java extension
2. The filename must match the class name.
3. Compile the java code with `javac HelloWorld.java` command
4. It complies and produces `HelloWorld.class` file.
5. We execute the file with the command `java HelloWorld`

    HelloWorld.java ---> HelloWorld.class --> Output

English - Hello, Cat, Welcome to Java programming.
French - Bonjour
German - Guten Morgen, Katze

Java - "Hello", "Cat", "Welcome to Java programming."

Human Language - Grammar - rules
Programming Language - Syntax - rules

```
park am the to going I
I am going to the park.
```

```java
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, World!");
    System.out.println("Welcome to Java programming.");
  }
}
```

## Language - words, numbers

Words ---> hi, there, good moring, class, bus

Numbers ---> 1, 2, 34, 3.14, 2.1

## Data types

1. Strings ---> Words are called Strings in Programming Language.
2. Integers --> Regular numbers without decimal point.

## Variable

It provides meaningful labels to our data.
It stores date.

int computer_mouse_price_in_dollars = 10;
int age = 32;
double PI = 3.14;

int age = 32;
int price = 100;

## Data types

1. Strings - "Hello", "Welcome to Java programming."
2. Integers - 1, 2, 34, 100
3. Double - 3.14, 2.1
4. Character - 'a', 'b', 'c'
5. Boolean - true, false

## String concatenation

String name = "Alice";
String greeting = "Hello, " + name + "!";
System.out.println(greeting);

## Arithmetic Operators

+, -, \*, /, %

value operator value
1 + 2
2 - 1
3 / 3
4 \* 2
10 % 5

## Comparison Operators

==, !=, <, >, >=, <=

"mouse" == "mouse"

2 == 2
2 != 3
2 < 3
3 > 2
2 >= 2
3 <= 3

We use comparison operators to generate true or false values.

## Boolean Operators

We use boolean operators to combine multiple conditions.

you are allowed in class if you come before 10 o'clock and also if you complete the homework else you are not allowed in class.

int class_time = 10;
int student_arrival_time = 9

boolean homework_completed = true

boolean is_allowed = student_arrival_time < class_time && homework_completed == true;

## If, Else If, Else

if (condition) {
// code to execute if condition is true
} else if (another_condition) {
// code to execute if another_condition is true
} else {
// code to execute if none of the above conditions are true
}

## Truth table

### AND

true && true = true
true && false = false
false && true = false
false && false = false

## OR

true || true = true
true || false = true
false || true = true
false || false = false

## NOT

!true = false
!false = true

## Loops

1. for loop = We use for loop when we know the number of iterations in advance.
2. while loop = We use while loop when we don't know the number of iterations in advance.

We use loops to repeat a block of code multiple times.

break statement is used to exit the loop when a certain condition is met.
