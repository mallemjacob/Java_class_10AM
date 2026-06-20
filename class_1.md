1. What Java is
2. How a Java program is structured
3. Variables
4. Basic data types
5. Printing output
6. Taking user input

---

# 1. What is Java?

Java is a programming language used to build:

- Web applications
- Android apps
- Enterprise software
- Banking systems
- Cloud applications

One of Java's famous principles is:

> "Write Once, Run Anywhere"

A Java program is compiled into **bytecode**, which runs on the **Java Virtual Machine (JVM)**.

---

# 2. Your First Java Program

Create a file named:

```text
HelloWorld.java
```

Write:

```java
public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World");

    }

}
```

Run:

```bash
javac HelloWorld.java
java HelloWorld
```

Output:

```text
Hello World
```

---

# 3. Understanding the Code

## Class

```java
public class HelloWorld
```

A class is a blueprint that contains code.

Think of it like a house blueprint.

The class name must match the filename:

```text
HelloWorld.java
```

contains:

```java
class HelloWorld
```

---

## Main Method

```java
public static void main(String[] args)
```

This is the starting point of every Java program.

When you run:

```bash
java HelloWorld
```

Java looks for:

```java
main()
```

and starts execution there.

---

## Printing Output

### println()

```java
System.out.println("Hello");
```

Output:

```text
Hello
```

Prints text and moves to the next line.

---

### print()

```java
System.out.print("Hello");
System.out.print("World");
```

Output:

```text
HelloWorld
```

No new line.

---

Example:

```java
System.out.println("Apple");
System.out.println("Banana");
```

Output:

```text
Apple
Banana
```

---

# 4. Variables

A variable stores data.

Example:

```java
int age = 25;
```

Think of it as a labeled box.

```text
age ---> 25
```

---

Example:

```java
public class Main {

    public static void main(String[] args) {

        int age = 25;

        System.out.println(age);

    }

}
```

Output:

```text
25
```

---

# 5. Basic Data Types

## int

Stores whole numbers.

```java
int age = 25;
int marks = 95;
```

---

## double

Stores decimal numbers.

```java
double price = 99.99;
```

---

## char

Stores a single character.

```java
char grade = 'A';
```

Notice single quotes.

---

## boolean

Stores true or false.

```java
boolean passed = true;
```

---

## String

Stores text.

```java
String name = "Jake";
```

Notice double quotes.

---

# 6. Printing Variables

```java
public class Main {

    public static void main(String[] args) {

        String name = "Jake";
        int age = 25;

        System.out.println(name);
        System.out.println(age);

    }

}
```

Output:

```text
Jake
25
```

---

# 7. Combining Text and Variables

Use `+`.

```java
String name = "Jake";

System.out.println("Hello " + name);
```

Output:

```text
Hello Jake
```

---

Example:

```java
int age = 25;

System.out.println("Age is " + age);
```

Output:

```text
Age is 25
```

---

# 8. Taking User Input

Java uses the Scanner class.

First import:

```java
import java.util.Scanner;
```

---

Example:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = scanner.nextLine();

        System.out.println("Hello " + name);

    }

}
```

Output:

```text
Enter your name: Jake
Hello Jake
```

---

# 9. Input Numbers

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");

        int age = scanner.nextInt();

        System.out.println("Age is " + age);

    }

}
```

---

# 10. Simple Calculator

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println("Sum = " + sum);

    }

}
```

Example:

```text
Enter first number: 10
Enter second number: 20
Sum = 30
```

---

# Practice Exercises

### Exercise 1

Print:

```text
My name is Jake
```

---

### Exercise 2

Create variables:

```java
name
age
city
```

Print all three.

---

### Exercise 3

Take a user's name as input and print:

```text
Welcome <name>
```

---

### Exercise 4

Take two numbers and print:

```text
Addition
Subtraction
Multiplication
```

---

# Summary

✅ Java program structure
✅ `class` and `main()`
✅ `System.out.println()`
✅ Variables
✅ Data types (`int`, `double`, `char`, `boolean`, `String`)
✅ String concatenation (`+`)
✅ User input with `Scanner`

- Arithmetic operators (`+`, `-`, `*`, `/`, `%`)
- Comparison operators (`==`, `!=`, `<`, `>`)
- `if`, `else if`, `else`
- Building a simple grade calculator
