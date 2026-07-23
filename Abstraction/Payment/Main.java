// Interfaces

// An interface describes a contract that classes agree to follow.


interface Payment {
    void pay(double amount);
    void refund(double amount);
}

class CreditCardPayment implements Payment {
  @Override
    public void pay(double amount) {
      System.out.println("Paid " + amount + " using Credit Card.");
    }
  @Override
    public void refund(double amount){
      System.out.println("Refunded " + amount + " to Credit Card.");
    }
}

class UpiPayment implements Payment {
  @Override
    public void pay(double amount) {
      System.out.println("Paid " + amount + " using UPI.");
    }
  @Override
    public void refund(double amount){
      System.out.println("Refunded " + amount + " to UPI.");
  }
}

public class Main {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new UpiPayment();

        payment1.pay(100.0); // Output: Paid 100.0 using Credit Card.
        payment2.pay(200.0); // Output: Paid 200.0 using U


        payment1.refund(50.0); // Output: Refunded 50.0 to Credit Card.
        payment2.refund(75.0); // Output: Refunded 75.0 to UPI.
    }
}