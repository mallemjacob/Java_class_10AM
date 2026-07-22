# Java OOP Concepts

## Learning objectives

By the end of this class, you should understand:

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

A useful mental model is:

> OOP organizes a program around objects that contain data and behavior.

For example, a `Car` object can contain:

- Data: brand, speed, fuel level
- Behavior: start, accelerate, stop

---

# 1. Classes and Objects

Before learning the four OOP concepts, students must understand classes and objects.

## Class

A class is a blueprint.

```java
class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is moving.");
    }
}
```

## Object

An object is an instance created from a class.

```java
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();

        car1.brand = "Toyota";
        car1.speed = 80;

        car1.drive();
    }
}
```

Output:

```text
Toyota is moving.
```

The class describes what a car has and does. The object represents one actual car in the program.

---

# The Four Pillars of OOP

```text
Object-Oriented Programming
│
├── Encapsulation
├── Inheritance
├── Polymorphism
└── Abstraction
```

---

# 2. Encapsulation

## Meaning

Encapsulation means:

> Keep an object's data protected and allow access through controlled methods.

Suppose we have a bank account:

```java
class BankAccount {
    double balance;
}
```

Anyone can write:

```java
account.balance = -50000;
```

This is dangerous because a balance should not be changed without rules.

## Encapsulated version

```java
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
```

Using the class:

```java
public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(5000);
        account.withdraw(1200);

        System.out.println("Balance: " + account.getBalance());
    }
}
```

Output:

```text
Balance: 3800.0
```

## Why use `private`?

```java
private double balance;
```

The field can only be accessed directly inside the `BankAccount` class.

The following code is not allowed:

```java
account.balance = -1000;
```

Instead, users must call controlled methods:

```java
account.deposit(1000);
account.withdraw(500);
```

## Getter and setter example

```java
class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age.");
        }
    }

    public int getAge() {
        return age;
    }
}
```

Here:

- `setAge()` controls how age is changed.
- `getAge()` returns the age.
- Invalid values can be rejected.

## Important clarification

Encapsulation is not simply “using getters and setters.”

The real purpose is to:

- Protect internal data
- Apply validation
- Control changes
- Hide implementation details

Sometimes a class should have a getter but no setter.

For example, an account number should not normally change:

```java
class BankAccount {
    private String accountNumber;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
```

There is no `setAccountNumber()` method, so the value cannot be changed from outside.

## Encapsulation summary

```text
private fields + controlled public methods
```

Real-world analogy:

> A medicine capsule hides its contents inside and provides them in a controlled form.

---

# 3. Inheritance

## Meaning

Inheritance means:

> A child class receives fields and methods from a parent class.

Suppose both students and teachers have:

- Name
- Age
- A method to display details

Without inheritance, we would repeat this code in multiple classes.

Instead, create a parent class.

## Parent class

```java
class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("My name is " + name);
        System.out.println("My age is " + age);
    }
}
```

## Child class

```java
class Student extends Person {
    int rollNumber;

    void study() {
        System.out.println(name + " is studying.");
    }
}
```

`Student` inherits:

```text
name
age
introduce()
```

It also has its own members:

```text
rollNumber
study()
```

## Complete example

```java
class Person {
    String name;
    int age;

    void introduce() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNumber;

    void study() {
        System.out.println(name + " is studying.");
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "Anita";
        student.age = 21;
        student.rollNumber = 101;

        student.introduce();
        student.study();
    }
}
```

Output:

```text
Name: Anita
Age: 21
Anita is studying.
```

## The `extends` keyword

```java
class Student extends Person
```

This describes an **is-a relationship**:

```text
Student is a Person
```

Other examples:

```text
Dog is an Animal
Car is a Vehicle
Manager is an Employee
SavingsAccount is a BankAccount
```

Inheritance should not be used when the relationship is not logically “is-a.”

For example:

```text
Car has an Engine
```

A car is not an engine, so inheritance is inappropriate. This is a **has-a relationship**, usually implemented using composition.

---

## Constructors and `super`

Constructors are not inherited, but a child constructor can call a parent constructor using `super()`.

```java
class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    void displayStudent() {
        displayPerson();
        System.out.println("Roll number: " + rollNumber);
    }
}
```

Create the object:

```java
Student student = new Student("Anita", 21, 101);
student.displayStudent();
```

Output:

```text
Name: Anita
Age: 21
Roll number: 101
```

`super(name, age)` calls the constructor of `Person`.

It must be the first statement in the child constructor.

---

## Types of inheritance in Java

Java classes support:

### Single inheritance

```text
Animal
  ↑
 Dog
```

```java
class Dog extends Animal {
}
```

### Multilevel inheritance

```text
Animal
  ↑
Mammal
  ↑
 Dog

Person
  ↑
Student
  ↑
InterStudent
```

```java
class Mammal extends Animal {
}

class Dog extends Mammal {
}
```

### Hierarchical inheritance

```text
       Animal
       /    \
     Dog    Cat
```

```java
class Dog extends Animal {
}

class Cat extends Animal {
}
```

Java does not allow a class to extend multiple classes:

```java
// Not allowed
class Child extends Parent1, Parent2 {
}
```

Multiple inheritance of behavior can be achieved through interfaces.

---

# 4. Polymorphism

## Meaning

Polymorphism means:

> One name or reference can represent multiple forms of behavior.

The word can be understood as:

```text
poly = many
morph = forms
```

Java mainly demonstrates two types:

1. Compile-time polymorphism: method overloading
2. Runtime polymorphism: method overriding

---

# Compile-Time Polymorphism: Method Overloading

Method overloading means:

> Multiple methods have the same name but different parameter lists.

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

Using the methods:

```java
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(10, 20));
        System.out.println(calculator.add(10, 20, 30));
        System.out.println(calculator.add(5.5, 2.5));
    }
}
```

Output:

```text
30
60
8.0
```

Java selects the appropriate method based on the arguments.

```java
add(10, 20);        // int, int
add(10, 20, 30);    // int, int, int
add(5.5, 2.5);      // double, double
```

Changing only the return type does not create valid overloading:

```java
int calculate(int number) {
    return number;
}

// Compilation error
double calculate(int number) {
    return number;
}
```

The parameter list must be different.

---

# Runtime Polymorphism: Method Overriding

Method overriding happens when a child class provides its own version of a parent method.

## Parent class

```java
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}
```

## Child classes

```java
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog says: Bark");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat says: Meow");
    }
}
```

Using polymorphism:

```java
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.makeSound();
        animal2.makeSound();
    }
}
```

Output:

```text
Dog says: Bark
Cat says: Meow
```

The reference type is:

```java
Animal
```

But the actual objects are:

```java
new Dog()
new Cat()
```

Java runs the method belonging to the actual object.

## Mental model

```java
Animal animal = new Dog();
```

Read this as:

> The variable can refer to any object that is an Animal.

Because a dog is an animal, this is valid.

When Java executes:

```java
animal.makeSound();
```

it checks the actual object at runtime. Because the object is a `Dog`, the `Dog` version runs.

---

## Why polymorphism is useful

Without polymorphism:

```java
Dog dog = new Dog();
Cat cat = new Cat();

dog.makeSound();
cat.makeSound();
```

With polymorphism, different objects can be handled through one common parent type:

```java
Animal[] animals = {
    new Dog(),
    new Cat(),
    new Dog()
};

for (Animal animal : animals) {
    animal.makeSound();
}
```

Output:

```text
Dog says: Bark
Cat says: Meow
Dog says: Bark
```

The loop does not need separate logic for every animal type.

---

## Overloading vs overriding

| Method overloading          | Method overriding        |
| --------------------------- | ------------------------ |
| Same method name            | Same method name         |
| Different parameters        | Same parameters          |
| Usually in the same class   | Parent and child classes |
| Compile-time polymorphism   | Runtime polymorphism     |
| Inheritance is not required | Inheritance is required  |

---

# 5. Abstraction

## Meaning

Abstraction means:

> Show what an object can do while hiding unnecessary implementation details.

Consider an ATM.

A user sees operations such as:

```text
Withdraw
Deposit
Check balance
```

The user does not need to understand:

- Database queries
- Network communication
- Account verification algorithms
- Internal banking systems

The complicated implementation remains hidden.

Java provides abstraction mainly through:

1. Abstract classes
2. Interfaces

---

# Abstract Classes

An abstract class is a class that cannot be instantiated directly.

```java
abstract class Vehicle {
}
```

This is not allowed:

```java
Vehicle vehicle = new Vehicle();
```

An abstract class can contain:

- Abstract methods
- Normal methods
- Fields
- Constructors

## Abstract method

An abstract method has no body:

```java
abstract void start();
```

It describes what child classes must do, but not exactly how they should do it.

## Example

```java
abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}
```

Child classes must implement `start()`:

```java
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts using a key or button.");
    }
}

class ElectricScooter extends Vehicle {
    @Override
    void start() {
        System.out.println("Scooter starts using electric power.");
    }
}
```

Using the classes:

```java
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        Vehicle vehicle2 = new ElectricScooter();

        vehicle1.start();
        vehicle1.stop();

        vehicle2.start();
        vehicle2.stop();
    }
}
```

Output:

```text
Car starts using a key or button.
Vehicle stopped.
Scooter starts using electric power.
Vehicle stopped.
```

The abstract class says:

> Every vehicle must have a `start()` behavior.

The child classes decide how that behavior works.

---

# Interfaces

An interface describes a contract that classes agree to follow.

```java
interface Payment {
    void pay(double amount);
}
```

Any class that implements `Payment` must provide a `pay()` method.

```java
class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using credit card.");
    }
}

class UpiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using UPI.");
    }
}
```

Using the interface:

```java
public class Main {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new UpiPayment();

        payment1.pay(1500);
        payment2.pay(800);
    }
}
```

Output:

```text
Paid ₹1500.0 using credit card.
Paid ₹800.0 using UPI.
```

The calling code only needs to know:

```java
payment.pay(amount);
```

It does not need to know how each payment type works internally.

---

# Abstract Class vs Interface

| Abstract class                    | Interface                                                   |
| --------------------------------- | ----------------------------------------------------------- |
| Used with `extends`               | Used with `implements`                                      |
| Can contain instance fields       | Usually represents a behavior contract                      |
| Can have constructors             | Cannot be instantiated and has no normal object constructor |
| A class can extend only one class | A class can implement multiple interfaces                   |
| Good for closely related classes  | Good for common capabilities                                |

Example of related classes:

```text
Vehicle
├── Car
└── Bike
```

An abstract class is suitable because all are vehicles.

Example of a capability:

```text
Payable
Printable
Downloadable
Serializable
```

An interface is suitable because unrelated classes may share the same capability.

---

# Complete Example Using All Four Concepts

This example combines encapsulation, inheritance, polymorphism, and abstraction.

```java
abstract class Employee {

    // Encapsulation
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative.");
            this.salary = 0;
        }
    }

    // Abstraction
    public abstract void performWork();

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

// Inheritance
class Developer extends Employee {

    private String programmingLanguage;

    public Developer(
            String name,
            double salary,
            String programmingLanguage
    ) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void performWork() {
        System.out.println(
            getName() + " writes " + programmingLanguage + " code."
        );
    }
}

// Inheritance
class Tester extends Employee {

    public Tester(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void performWork() {
        System.out.println(getName() + " tests the application.");
    }
}

public class Main {
    public static void main(String[] args) {

        // Runtime polymorphism
        Employee employee1 =
                new Developer("Anita", 60000, "Java");

        Employee employee2 =
                new Tester("Rahul", 50000);

        Employee[] employees = {employee1, employee2};

        for (Employee employee : employees) {
            employee.displayDetails();
            employee.performWork();
            System.out.println("----------------");
        }
    }
}
```

Output:

```text
Name: Anita
Salary: 60000.0
Anita writes Java code.
----------------
Name: Rahul
Salary: 50000.0
Rahul tests the application.
----------------
```

## Where are the four concepts?

### Encapsulation

```java
private String name;
private double salary;
```

Data is protected and accessed through methods.

### Inheritance

```java
class Developer extends Employee
class Tester extends Employee
```

Both child classes inherit from `Employee`.

### Polymorphism

```java
Employee employee1 = new Developer(...);
Employee employee2 = new Tester(...);
```

The same `Employee` reference type represents different objects.

```java
employee.performWork();
```

The result depends on the actual object.

### Abstraction

```java
abstract class Employee
```

and:

```java
public abstract void performWork();
```

Every employee must perform work, but each employee type performs it differently.

---

# Simple Real-World Comparison

## Encapsulation

A bank account protects its balance.

```text
Do not change the balance directly.
Use deposit() and withdraw().
```

## Inheritance

A developer is an employee.

```text
Employee
   ↑
Developer
```

## Polymorphism

Different employees perform work differently.

```text
Developer.performWork() → writes code
Tester.performWork()    → tests software
```

## Abstraction

The company knows every employee performs work, without needing one universal implementation.

```java
employee.performWork();
```

---

# Suggested Classroom Demonstration

Start with this parent class:

```java
class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}
```

Ask students:

> How could we create dogs and cats without repeating common animal properties?

Then introduce inheritance:

```java
class Dog extends Animal {
}
```

Next, override the method:

```java
@Override
void makeSound() {
    System.out.println("Bark");
}
```

Then demonstrate polymorphism:

```java
Animal animal = new Dog();
animal.makeSound();
```

Protect a field using encapsulation:

```java
private int age;
```

Finally, make the parent abstract:

```java
abstract class Animal {
    abstract void makeSound();
}
```

This teaching sequence lets students watch the design improve one step at a time.

---

# Common Student Questions

## Can we create an object of an abstract class?

No.

```java
abstract class Animal {
}

// Error
Animal animal = new Animal();
```

But an abstract-class reference can point to a child object:

```java
Animal animal = new Dog();
```

## Are private fields inherited?

The child object contains the inherited state, but the child class cannot directly access private fields.

Use protected or public methods:

```java
getName();
setName();
```

Usually, keeping fields private is safer.

## Is method overloading inheritance?

No. Overloading does not require inheritance.

## Is method overriding inheritance?

Yes. A child class overrides a method inherited from its parent.

## Can Java support multiple inheritance?

A class cannot extend multiple classes.

```java
// Invalid
class C extends A, B {
}
```

A class can implement multiple interfaces:

```java
class SmartPhone implements Camera, MusicPlayer {
}
```

---

# Practice Exercise

Create an abstract class called `Shape`.

It should contain:

```java
private String color;
```

Add:

```java
getColor()
abstract double calculateArea()
```

Create two child classes:

```text
Circle
Rectangle
```

Requirements:

```java
Circle circle = new Circle("Red", 5);
Rectangle rectangle = new Rectangle("Blue", 4, 6);
```

Store them in:

```java
Shape[] shapes = {circle, rectangle};
```

Use a loop to print each shape's color and area.

Expected ideas:

```text
Circle area = π × radius × radius
Rectangle area = length × width
```

This one exercise practices:

- `private` fields: encapsulation
- `extends`: inheritance
- `Shape` references: polymorphism
- Abstract `calculateArea()`: abstraction

---

# Final Revision Table

| Concept       | Main idea                                         | Java feature                           |
| ------------- | ------------------------------------------------- | -------------------------------------- |
| Encapsulation | Protect and control data                          | `private`, getters, controlled methods |
| Inheritance   | Reuse and extend a parent class                   | `extends`, `super`                     |
| Polymorphism  | Same reference or method name, different behavior | Overloading and overriding             |
| Abstraction   | Show essential operations and hide implementation | `abstract`, `interface`, `implements`  |

A compact way to remember them:

> **Encapsulation protects, inheritance reuses, polymorphism varies, and abstraction hides complexity.**
