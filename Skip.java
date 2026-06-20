public class Skip {
  public static void main(String[] args){
    /////////////////////
    for(int i = 1; i <= 10; i++){
        if (i >= 5 && i <= 7) {
          continue;
        } else {
        System.out.println(i); // 1, 2, 3, 4
        }
      }
    }
    /////////////////////
  }


// 5,6,7 --> 1,2,3,4,8,9,10