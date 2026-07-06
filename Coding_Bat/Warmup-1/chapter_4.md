# Java Chapter 4: Classes and Objects

## Learning Objectives

By the end of this class, you should understand:

- What Object-Oriented Programming is
- What a class is
- What an object is
- Fields (instance variables)
- Creating objects
- Accessing fields
- Creating multiple objects
- Memory concept (Stack vs Heap - beginner level)

---

# 1. Procedural Programming vs Object-Oriented Programming

Suppose you're writing a program for a college.

Each student has:

- Name
- Age
- Marks

Without classes:

```java
String student1Name = "Jake";
int student1Age = 26;
double student1Marks = 91.5;

String student2Name = "David";
int student2Age = 23;
double student2Marks = 87.2;
```

Imagine storing information for **10,000 students**.

The program becomes difficult to manage.

Instead, we group related data together.

That's exactly what a **class** does.

---

# 2. What is a Class?

A **class** is a blueprint or template for creating objects.

Think about building a house.

A blueprint is **not** a house.

It only describes:

- Number of rooms
- Kitchen
- Windows
- Doors

Similarly,

A Java class describes:

- What data an object has
- What actions it can perform

---

# Real-world Examples

| Class   | Object        |
| ------- | ------------- |
| Student | Jake          |
| Student | David         |
| Car     | BMW Car       |
| Car     | Audi Car      |
| Mobile  | Samsung Phone |
| Mobile  | iPhone        |

Notice:

One class can create many objects.

---

# 3. Creating Your First Class

```java
class Student {

    String name;
    int age;

}
```

This class describes what every student should have.

Currently every student has:

- name
- age

Nothing else.

---

# 4. What is an Object?

An object is a real instance of a class.

Example:

```java
Student s1 = new Student();
```

This creates one student.

Think of it like this:

Blueprint

↓

House 1

↓

House 2

↓

House 3

The blueprint stays the same.

Many houses can be built.

Similarly,

One class

↓

Many objects

---

# 5. Understanding This Statement

```java
Student s1 = new Student();
```

Let's break it into parts.

## Student

Datatype

Similar to:

```java
int number;
```

Here,

```java
Student s1;
```

means:

> "I want a variable that can store a Student object."

---

## s1

Reference variable

It doesn't store the entire object.

It stores the address of the object.

---

## new

Creates a new object in memory.

Whenever Java sees:

```java
new Student()
```

Java allocates memory.

---

# Visual Representation

```text
Stack Memory

s1
 |
 |
 V

Heap Memory

Student Object

name = null

age = 0
```

Notice:

String defaults to

```text
null
```

int defaults to

```text
0
```

---

# 6. Assigning Values

```java
Student s1 = new Student();

s1.name = "Jake";
s1.age = 26;
```

Now memory looks like:

```text
Student Object

name = Jake

age = 26
```

---

# 7. Accessing Values

Use the dot (`.`) operator.

```java
System.out.println(s1.name);
System.out.println(s1.age);
```

Output

```text
Jake

26
```

The dot operator means:

> "Access a member of this object."

---

# 8. Complete Example

```java
class Student {

    String name;
    int age;

}

public class Main {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Jake";
        s1.age = 26;

        System.out.println(s1.name);
        System.out.println(s1.age);

    }

}
```

Output

```text
Jake
26
```

---

# 9. Creating Multiple Objects

```java
Student s1 = new Student();

Student s2 = new Student();
```

Assign values.

```java
s1.name = "Jake";
s1.age = 26;

s2.name = "David";
s2.age = 23;
```

Print.

```java
System.out.println(s1.name);
System.out.println(s2.name);
```

Output

```text
Jake
David
```

Notice:

Both objects are created from the same class.

---

# 10. Memory Diagram

```text
Stack

s1  ---------

             |

             V

Heap

Student

name = Jake

age = 26

------------------------

s2 ---------

             |

             V

Heap

Student

name = David

age = 23
```

Each object has its **own copy** of the fields.

Changing one object doesn't affect the other.

```java
s1.age = 30;
```

Only `s1.age` changes.

`s2.age` remains `23`.

---

# 11. Why Not Use Variables Instead?

Instead of writing:

```java
String name1;
int age1;

String name2;
int age2;

String name3;
int age3;
```

We simply write:

```java
Student s1 = new Student();

Student s2 = new Student();

Student s3 = new Student();
```

This is cleaner, scalable, and easier to maintain.

---

# 12. Common Beginner Mistake

```java
Student s1;
```

This **does not create an object**.

It only declares a reference.

If you do:

```java
s1.name = "Jake";
```

You'll get a **NullPointerException** because `s1` doesn't point to any object.

You must first create the object:

```java
Student s1 = new Student();
```

---

# 13. Practice Exercise

Create a class named `Book` with:

- `title`
- `author`
- `price`

Create two book objects.

Assign different values.

Print all details.

Expected output:

```text
Book 1

Title : Clean Code

Author : Robert Martin

Price : 499

-----------------

Book 2

Title : Effective Java

Author : Joshua Bloch

Price : 650
```

---

# Key Takeaways

- **Class** → Blueprint or template.
- **Object** → A real instance created from a class.
- **Fields** → Variables inside a class that describe an object's state.
- `new` → Allocates memory and creates a new object.
- `.` (dot operator) → Accesses fields or methods of an object.
- Each object has its own independent data.

---
