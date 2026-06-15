public class Student {
  public static void main(String[] args){
      int class_time = 10;
      int student_arrival_time = 9;

      boolean homework_completed = true;

      if (student_arrival_time <= class_time && homework_completed == true) {
          System.out.println("You can come to the class");
      } else {
        System.out.println("You are late for the class");
      }
  }
}
