// class Calculator {
//     public int add(int a, int b) {
//         return a + b;
//     }

//     public double add(double a, double b) {
//         return a + b;
//     }
// }


class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}


class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}


class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}




public class Main{
  public static void main(String[] args) {


    Dog dog = new Dog();
    Cat cat = new Cat();

    dog.makeSound(); // Calls the overridden method in Dog class
    cat.makeSound(); // Calls the overridden method in Cat class


    // Calculator calc = new Calculator();
    // System.out.println(calc.add(5, 10)); // Calls the int version
    // System.out.println(calc.add(5.5, 10.5)); // Calls the double version
  }
}