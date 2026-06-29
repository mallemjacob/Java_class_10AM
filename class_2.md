# Methods (Functions) in Java

Methods are one of the most important concepts in Java. Almost every Java program beyond a few lines uses methods extensively.

---

# Why Do We Need Methods?

Imagine writing:

```java
System.out.println("Welcome Jake");
System.out.println("Welcome Manu");
System.out.println("Welcome John");
System.out.println("Welcome David");
```

This works, but what if you need to do it 100 times?

Methods allow us to write code once and reuse it many times.

---

# What is a Method?

A method is a block of code that performs a specific task.

Example:

```java
public static void greet() {
    System.out.println("Welcome");
}
```

This method's job is simply to print "Welcome".

---

# Defining vs Calling a Method

## Defining

```java
public static void greet() {
    System.out.println("Welcome");
}
```

We're creating the method.

## Calling

```java
greet();
```

We're executing the method.

---

# First Complete Example

```java
public class Main {

    public static void greet() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        greet();
    }
}
```

Output:

```text
Welcome
```

---

# Breaking Down the Syntax

```java
public static void greet()
```

Let's understand each part.

## public

The method can be accessed from anywhere.

For now, always write:

```java
public
```

---

## static

Allows `main()` to call the method directly.

For now, always write:

```java
static
```

---

## void

Means the method does not return anything.

Example:

```java
public static void greet()
```

It prints something but gives nothing back.

---

## greet

The method name.

You can choose meaningful names:

```java
calculateSum()
printMenu()
showStudent()
```

---

# Calling a Method Multiple Times

```java
public class Main {

    public static void greet() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {

        greet();
        greet();
        greet();

    }
}
```

Output:

```text
Welcome
Welcome
Welcome
```

---

# Methods with Parameters

Hardcoded method:

```java
public static void greet() {
    System.out.println("Welcome Jake");
}
```

Problem:

It only works for Jake.

Instead:

```java
public static void greet(String name) {
    System.out.println("Welcome " + name);
}
```

Now:

```java
greet("Jake");
greet("Manu");
greet("John");
```

Output:

```text
Welcome Jake
Welcome Manu
Welcome John
```

---

# Understanding Parameters

```java
public static void greet(String name)
```

`name` is a parameter.

Think of it as a placeholder.

When we call:

```java
greet("Jake");
```

Java does:

```java
name = "Jake";
```

Then executes the method.

---

# Multiple Parameters

```java
public static void student(String name, int age) {

    System.out.println(name);
    System.out.println(age);

}
```

Call:

```java
student("Jake", 26);
```

Output:

```text
Jake
26
```

---

# Methods Returning Values

So far:

```java
void
```

means return nothing.

Now let's return something.

```java
public static int add(int a, int b) {

    return a + b;

}

```

Call:

```java
int result = add(10, 20);

System.out.println(result);
```

Output:

```text
30
```

---

# How Return Works

```java
return a + b;
```

Suppose:

```java
add(10,20)
```

Java computes:

```java
30
```

and sends it back.

Equivalent to:

```java
int result = 30;
```

---

# Visual Flow

```java
add(10,20)
```

↓

```java
a = 10
b = 20
```

↓

```java
return 30
```

↓

```java
result = 30
```

---

# Common Return Types

## int

```java
public static int square(int n) {
    return n * n;
}
```

---

## double

```java
public static double area(double r) {
    return 3.14 * r * r;
}
```

---

## String

```java
public static String getName() {
    return "Jake";
}
```

---

## boolean

```java
public static boolean isAdult(int age) {
    return age >= 18;
}
```

---

# Real Example: Even or Odd

```java
public class Main {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static void main(String[] args) {

        System.out.println(isEven(10));
        System.out.println(isEven(7));

    }
}
```

Output:

```text
true
false
```

---

# Method Overloading

Java allows multiple methods with the same name.

```java
public static int add(int a, int b) {
    return a + b;
}

public static int add(int a, int b, int c) {
    return a + b + c;
}
```

Calls:

```java
add(10,20);
add(10,20,30);
```

Java automatically chooses the correct method.

---

# Good Method Naming

Use verbs:

✅

```java
calculateSalary()
printReport()
findMaximum()
checkLogin()
```

Avoid:

❌

```java
abc()
test1()
xyz()
```

---

# Practice Problems

### 1. Create a method

```java
sayHello()
```

Output:

```text
Hello Student
```

---

### 2. Create

```java
square(int n)
```

Return square of a number.

Example:

```java
square(5)
```

Output:

```text
25
```

---

### 3. Create

```java
isPositive(int n)
```

Return:

```text
true
```

if number is positive.

---

### 4. Create

```java
findMax(int a, int b)
```

Return larger number.

Example:

```java
findMax(10,20)
```

Output:

```text
20
```

---

# Key Takeaways

A method has four main parts:

```java
public static returnType methodName(parameters)
```

Example:

```java
public static int add(int a, int b)
```

- `public` → access modifier
- `static` → callable from `main`
- `int` → return type
- `add` → method name
- `(int a, int b)` → parameters
