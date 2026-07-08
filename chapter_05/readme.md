# Java Class 5: OOP Principles

## Learning Objectives

By the end of this class, you will understand:

- Constructors
- Encapsulation
- Inheritance
- Polymorphism
- Method Overriding
- The `super` keyword
- Why OOP is useful in real applications

---

# What is OOP?

OOP (**Object-Oriented Programming**) is a programming paradigm where software is designed using **objects**.

Imagine building a College Management System.

Instead of writing everything in one file:

Class --> We create multiple Objects.

```
Student
Teacher
Course
Library
Department
```

Each becomes its own class.

This makes programs:

- Easier to understand
- Easier to maintain
- Easier to extend

---

# 1. Constructors

## What Problem Does a Constructor Solve?

Previously we created objects like this:

```java
Student s1 = new Student();

s1.name = "Jake";
s1.age = 26;
```

If you forget to assign one value:

```java
Student s1 = new Student();
```

then

```
name = null
age = 0
```

This may produce incorrect data.

A constructor ensures that an object starts with valid values.

---

## What is a Constructor?

A constructor is a special method that runs **automatically** when an object is created.

Characteristics:

- Same name as the class
- No return type
- Called automatically

---

### Example

```java
class Student {

    String name;
    int age;

    Student() {
        System.out.println("Student object created");
    }

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

    }

}
```

Output

```
Student object created
```

---

## Parameterized Constructor

```java
class Student {

    String name;
    int age;

    Student(String n, int a) {
        name = n;
        age = a;
    }

}
```

Create object:

```java
Student s1 = new Student("Jake", 26);

System.out.println(s1.name);
System.out.println(s1.age);
```

Output

```
Jake
26
```

Much cleaner than assigning fields one by one.

---

# The `this` Keyword

Instead of:

```java
Student(String n, int a) {

    name = n;
    age = a;

}
```

We often write:

```java
Student(String name, int age) {

    this.name = name;
    this.age = age;

}
```

Here:

- `this.name` → instance variable
- `name` → constructor parameter

Without `this`, Java can't distinguish between them.

---

# 2. Encapsulation

## What Problem Does It Solve?

Suppose anyone can change a student's age:

```java
student.age = -50;
```

This is invalid.

We need to protect the data.

That's where encapsulation comes in.

---

## Definition

Encapsulation means:

- Hide data
- Allow controlled access

We use:

- `private` variables
- Public getter/setter methods

---

### Example

```java
class Student {

    private int age;

    public void setAge(int age) {

        if(age > 0) {
            this.age = age;
        }

    }

    public int getAge() {
        return age;
    }

}
```

Use it:

```java
Student s = new Student();

s.setAge(26);

System.out.println(s.getAge());
```

Output

```
26
```

Now invalid values can be rejected.

---

# Access Modifiers

| Modifier  | Same Class | Same Package | Subclass | Other Package |
| --------- | ---------- | ------------ | -------- | ------------- |
| private   | ✅         | ❌           | ❌       | ❌            |
| default   | ✅         | ✅           | ❌       | ❌            |
| protected | ✅         | ✅           | ✅       | ❌\*          |
| public    | ✅         | ✅           | ✅       | ✅            |

For beginners:

- `private` → only inside the class
- `public` → accessible everywhere

---

# 3. Inheritance

## Why Inheritance?

Suppose:

```java
Student
Teacher
Principal
```

All have:

- name
- age

Without inheritance:

You repeat the same code.

Instead:

```
Person

   ↑

Student

Teacher

Principal
```

---

### Parent Class

```java
class Person {

    String name;
    int age;

}
```

---

### Child Class

```java
class Student extends Person {

    int rollNo;

}
```

Now Student automatically has:

- name
- age
- rollNo

---

### Example

```java
Student s = new Student();

s.name = "Jake";
s.age = 26;
s.rollNo = 101;
```

Student inherited:

```
name

age
```

from Person.

---

# `extends`

```java
class Student extends Person
```

means

> Student inherits everything from Person (except private members).

---

# 4. The `super` Keyword

Suppose:

```java
class Person {

    Person() {
        System.out.println("Person Constructor");
    }

}
```

Child:

```java
class Student extends Person {

    Student() {

        super();

        System.out.println("Student Constructor");

    }

}
```

Output

```
Person Constructor

Student Constructor
```

`super()` calls the parent constructor.

---

# 5. Polymorphism

The word means:

> Many forms

One interface.

Different implementations.

---

### Method Overriding

Parent

```java
class Animal {

    void sound() {

        System.out.println("Animal sound");

    }

}
```

Child

```java
class Dog extends Animal {

    @Override
    void sound() {

        System.out.println("Bark");

    }

}
```

Another child

```java
class Cat extends Animal {

    @Override
    void sound() {

        System.out.println("Meow");

    }

}
```

---

### Runtime Polymorphism

```java
Animal a;

a = new Dog();
a.sound();

a = new Cat();
a.sound();
```

Output

```
Bark

Meow
```

Notice:

Same method call:

```java
a.sound();
```

Different outputs.

This is **runtime polymorphism**.

---

# Why is Polymorphism Useful?

Imagine a game with different enemies.

```java
Enemy enemy;
```

Sometimes:

```java
enemy = new Zombie();
```

Sometimes:

```java
enemy = new Dragon();
```

Calling:

```java
enemy.attack();
```

works correctly for each type without changing the calling code.

---

# Method Overloading vs Overriding

## Overloading

Same method name.

Different parameters.

```java
add(int a, int b)

add(int a, int b, int c)
```

Compile-time polymorphism.

---

## Overriding

Parent method replaced by child.

```java
Animal → sound()

Dog → sound()
```

Runtime polymorphism.

---

# The Four Pillars of OOP

### 1. Encapsulation

Hide data.

```
private variables
```

---

### 2. Inheritance

Reuse existing code.

```
Person

↓

Student
```

---

### 3. Polymorphism

Same method.

Different behavior.

```
sound()

↓

Dog

↓

Cat
```

---

### 4. Abstraction (Preview)

Hide implementation.

Show only essential features.

Example:

When driving a car, you use the steering wheel, pedals, and gear lever. You don't need to know how the engine or transmission works internally.

We'll cover abstraction in depth in the next class using **abstract classes** and **interfaces**.

---

# Practice Exercise

Create:

```
Person
```

Fields:

- name
- age

Create:

```
Employee extends Person
```

Additional field:

```
salary
```

Tasks:

1. Create a constructor.
2. Use `super()` to initialize inherited fields.
3. Make `salary` private.
4. Add `getSalary()` and `setSalary()`.
5. Override a method:

```java
void display()
```

Display:

```
Name

Age

Salary
```

---

# Summary

| Concept            | Purpose                                          |
| ------------------ | ------------------------------------------------ |
| Constructor        | Initialize objects                               |
| `this`             | Refer to the current object's fields             |
| Encapsulation      | Protect data using `private` and getters/setters |
| Inheritance        | Reuse code with `extends`                        |
| `super`            | Access parent class constructor or members       |
| Polymorphism       | One method call, different behavior              |
| Method Overloading | Same name, different parameters                  |
| Method Overriding  | Child provides its own implementation            |

## Next Class (Class 6)

We'll cover **Abstraction and Interfaces** in depth:

- Abstract classes
- Abstract methods
- Interfaces
- `implements`
- Multiple inheritance using interfaces
- Default and static interface methods
- Functional interfaces and lambda expressions (introduction)

These concepts complete the core OOP toolkit and are heavily used in enterprise Java frameworks such as **Spring Boot**.
