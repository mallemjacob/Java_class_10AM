# Java Class 3: Arrays (In Depth)

## Learning Objectives

By the end of this class, you will understand:

- What an array is
- Why arrays are needed
- How arrays are stored in memory
- Creating arrays
- Accessing elements
- Updating elements
- Finding the length
- Traversing arrays
- Common mistakes
- Practice problems

---

# 1. Why Do We Need Arrays?

Imagine storing marks for 5 students.

Without arrays:

```java
int mark1 = 90;
int mark2 = 85;
int mark3 = 76;
int mark4 = 88;
int mark5 = 91;
```

What if there are **1,000 students**?

You would need 1,000 variables!

Arrays solve this problem by storing multiple values of the same type in one variable.

```java
int[] marks = {90, 85, 76, 88, 91};
```

---

# 2. What is an Array?

An **array** is a collection of elements of the **same data type**, stored **contiguously** (next to each other) in memory.

Example:

```java
int[] numbers = {10, 20, 30, 40, 50};
```

Memory representation:

```
Index:     0    1    2    3    4

Value:    10   20   30   40   50
```

Notice that arrays always start at **index 0**.

---

# 3. Creating an Array

### Method 1: Declare and initialize together

```java
int[] numbers = {10, 20, 30, 40, 50};
```

---

### Method 2: Create first, assign later

```java
int[] numbers = new int[5];
```

Initially:

```
Index:   0  1  2  3  4

Value:   0  0  0  0  0
```

Now assign values:

```java
numbers[0] = 15;
numbers[1] = 25;
numbers[2] = 35;
numbers[3] = 45;
numbers[4] = 55;
```

---

# 4. Accessing Elements

Syntax:

```java
arrayName[index]
```

Example:

```java
int[] numbers = {10,20,30,40,50};

System.out.println(numbers[0]);
System.out.println(numbers[3]);
```

Output

```
10
40
```

---

# 5. Updating Elements

Arrays are mutable.

```java
int[] numbers = {10,20,30};

numbers[1] = 99;

System.out.println(numbers[1]);
```

Output

```
99
```

The old value (`20`) is replaced.

---

# 6. Array Length

Every array has a property called `length`.

```java
int[] numbers = {10,20,30,40,50};

System.out.println(numbers.length);
```

Output

```
5
```

Notice:

```java
numbers.length
```

There are **no parentheses** because `length` is a property, not a method.

---

# 7. Traversing an Array

Instead of writing:

```java
System.out.println(numbers[0]);
System.out.println(numbers[1]);
System.out.println(numbers[2]);
System.out.println(numbers[3]);
```

Use a loop.

```java
int[] numbers = {10,20,30,40,50};

for(int i = 0; i < numbers.length; i++) {

    System.out.println(numbers[i]);

}
```

Output

```
10
20
30
40
50
```

### How it works

```
i = 0 → numbers[0] → 10

i = 1 → numbers[1] → 20

i = 2 → numbers[2] → 30

...

Stop when i == numbers.length
```

---

# 8. Enhanced for Loop (For-each Loop)

When you only need to read every element, Java provides a simpler loop.

```java
int[] numbers = {10,20,30,40};

for(int num : numbers) {

    System.out.println(num);

}
```

Output

```
10
20
30
40
```

Think of it as:

> "For each number in the array, print it."

Use a regular `for` loop when you need the index or want to modify elements.

---

# 9. Common Mistake: Index Out of Bounds

```java
int[] numbers = {10,20,30};

System.out.println(numbers[3]);
```

This causes an error because valid indexes are:

```
0
1
2
```

The last valid index is always:

```java
array.length - 1
```

---

# 10. Common Mistake: Confusing Length with Last Index

```java
int[] arr = {5, 10, 15, 20};
```

- `arr.length` is `4`
- Last valid index is `3`

Trying `arr[4]` will throw an `ArrayIndexOutOfBoundsException`.

---

# 11. Example: Find the Sum of an Array

```java
public class Main {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40};

        int sum = 0;

        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Sum = " + sum);
    }
}
```

Output

```
Sum = 100
```

---

# 12. Example: Find the Largest Number

```java
public class Main {

    public static void main(String[] args) {

        int[] numbers = {25, 12, 80, 45, 30};

        int max = numbers[0];

        for(int i = 1; i < numbers.length; i++) {

            if(numbers[i] > max) {
                max = numbers[i];
            }

        }

        System.out.println("Maximum = " + max);
    }
}
```

Output

```
Maximum = 80
```

---

# Practice Exercises

1. Create an array of five integers and print all elements using a `for` loop.

2. Find the sum of all elements in an array.

3. Find the largest element in an array.

4. Count how many numbers in the array are even.

5. Reverse-print an array (print from the last element to the first without changing the array).

---

# Summary

Today you learned:

- ✅ What arrays are and why they are useful
- ✅ How to declare and initialize arrays
- ✅ How indexing works (starting at 0)
- ✅ How to access and update elements
- ✅ How to use `length`
- ✅ How to traverse arrays with both `for` and enhanced `for` loops
- ✅ How to avoid `ArrayIndexOutOfBoundsException`
- ✅ Basic array algorithms like summing and finding the maximum

### Homework

Write methods for the following:

```java
int sum(int[] arr)
int max(int[] arr)
int min(int[] arr)
int countEven(int[] arr)
```

These combine the **methods** you learned in Class 2 with the **arrays** from this class, and they're excellent preparation for DSA.
