abstract class Vehicle {
    // Abstract method (does not have a body)
    abstract void start();

    // Non-abstract method (has a body)
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}


class Car extends Vehicle {
  // Implementing the abstract method
    @Override
    void start() {
        System.out.println("Car started.");
    }
}


public class Main{
  
    public static void main(String[] args) {
        Vehicle myCar = new Car(); // Create a Car object
        myCar.start(); // Call the implemented method
        myCar.stop();  // Call the non-abstract method
    }
}