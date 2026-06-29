public class Arrays {
  public static void main(String[] args){
    int[] nums = {1,2,3,4,5,6,7,8};
    System.out.println(nums[0]);
    System.out.println(nums[1]);
    System.out.println(nums[7]);
    
    int[] numbers = new int[5];

    // Use assignment operator and index to store a new value in an array
    numbers[0] = 100;
    numbers[1] = 101;
    numbers[2] = 102;
    numbers[3] = 103;
    numbers[4] = 104;

    // Accessing values from the array with indexes
    System.out.println(numbers[0]);
    System.out.println(numbers[1]);
    System.out.println(numbers[2]);
    System.out.println(numbers[3]);
    System.out.println(numbers[4]);

    numbers[4] = 404;

    System.out.println(numbers[4]);
    
    int[] numbers2 = {10,20,30,40,50,60,70,80,90,100,101,102,103,104,105,106,107,108,109,0,1,2,3,5,6,6,7,8};

    System.out.println(numbers2.length);

    System.out.println(numbers2[numbers2.length - 1]);

    String[] fruits = {"apples","bananas","oranges","mangoes","kiwis","pears"};

    System.out.println(fruits[fruits.length - 1]);
  }
}


// Values
// 1, 2, 3, 4, 5

// Indexs
// 0, 1, 2, 3, 4


// Values
// 90, 85, 76, 88, 91

// 0,  1,  2,  3,  4


// String name = 'mouse'