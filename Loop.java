public class Loop {
  public static void main(String[] args){
    for(int i = 1; i <= 10; i++){
      ////////////////////
      if (i == 5){ // 5 == 5
        break;
      } else {
        System.out.println(i); // 1, 2, 3, 4
      }
      ////////////////////
    }
  }
}

// i = 5
// i <= 10 
// print the block of code
// increment i by 1



// public class Loop {
//   public static void main(String[] args){
//     if (12 > 10){
//       for(int i = 1; i <= 5; i++){
//         System.out.println("hi");
//       }
//     } else {
//       for(int i = 1; i <= 5; i++){
//        System.out.println("bye");
//       }
//     }
//   }
// }